//importaciones necesarias

import http from 'k6/http';
import { check, sleep } from "k6";
import { randomString } from 'https://jslib.k6.io/k6-utils/1.2.0/index.js';
import { BASE_URL, TODO_PATH } from '../Utils/const.js';

// Configutacion de prueba de performance
export let options = {
  stages: [
    { duration: "10s", target: 10 },
    { duration: "5m", target: 10 },
    { duration: "10s", target: 0 },
  ]
};

export default function () {
  //Envío de peticiones REST
  const body = {
    "title": randomString(8),
    "description": randomString(18),
    "completed": false
  }

  const response = http.post(
    BASE_URL + TODO_PATH,
    JSON.stringify(body),
    { headers: { Accepts: "application/json" } }
  );

//Puntos de verificacion con libreria Check de K6
check(response, {"Status code de creación es 201": (r)=>r.status===201});
sleep(.299);
};