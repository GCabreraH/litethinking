import http from 'k6/http';
import { check, sleep } from 'k6';
import { randomString, randomItem } from 'https://jslib.k6.io/k6-utils/1.2.0/index.js';
import { BASE_URL, TODO_PATH } from '../Utils/const.js';

// Configuración de las etapas (stages) de la prueba de performance
export let options = {
  stages: [
    { duration: '1m', target: 50 }, // Subir a 50 usuarios virtuales en 1 minuto
    { duration: '3m', target: 50 }, // Mantener 50 usuarios por 3 minutos
    { duration: '1m', target: 0 },  // Reducir a 0 usuarios en 1 minuto
  ],
  thresholds: {
    http_req_failed: ['rate<0.01'], // Menos del 1% de las solicitudes pueden fallar
    http_req_duration: ['p(95)<400'], // El 95% de las solicitudes deben tardar menos de 400ms
  },
};

// Definir la URL completa del endpoint
const ENDPOINT = BASE_URL + TODO_PATH;
const index = [1, 2, 3, 4]; // Ejemplo de IDs de los TO DOs

export default function () {
  // 1. Consultar todos los TO DO's
  let response = http.get(ENDPOINT, {
    headers: { Accepts: 'application/json' },
  });
  check(response, { 'Status Code es 200 en get todos': (r) => r.status === 200 });
  sleep(0.3);

  // 2. Consultar un TO DO específico
  let responseShow = http.get(`${ENDPOINT}/${randomItem(index)}`, {
    headers: { Accepts: 'application/json' },
  });
  check(responseShow, { 'Status Code es 200 en get TO DO': (r) => r.status === 200 });
  sleep(0.3);

  // 3. Crear un nuevo TO DO
  const body = {
    title: randomString(8),
    description: randomString(18),
    completed: false,
  };

  let responseCreate = http.post(
    ENDPOINT,
    JSON.stringify(body),
    { headers: { Accepts: 'application/json' } }
  );
  check(responseCreate, { 'Status Code es 201 en creación de TO DO': (r) => r.status === 201 });
  sleep(0.3);
}
