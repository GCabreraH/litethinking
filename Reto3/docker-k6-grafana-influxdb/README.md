# Reto 3 Caso de Pruebas de Perfomance

Proyecto inspirado en el articulo - <https://medium.com/swlh/beautiful-load-testing-with-k6-and-docker-compose-4454edb3a2e3> - Para temas academicos

Aplicación utilizada para ser Objeto de pruebas localizada en:
<https://github.com/eaccmk/node-app-http-docker>

## Herramientas utilizadas

- K6
- InfluxDB
- Grafana

## Precondiciones

Tener instalado Docker en la maquina donde se van a ejecutar las pruebas.

## Configuracion

Crear contenedores de Grafana e InfluxDB

```bash
docker compose up -d influxdb grafana app
```

## Dashboards

Para ver el dashboard se debe ingresar a
<http://localhost:3000/d/k6/k6-load-testing-results>

## Run Tests

### Flows

#### Caso Reto3

```bash
docker compose run --rm k6 run  /scripts/Flows/PruebaWorkshop.js
```
El caso de prueba de performance diseñado tiene el objetivo de evaluar cómo responde una API bajo diferentes cargas, simulando usuarios que realizan tres operaciones clave: consultar todos los TO DO's, consultar uno específico y crear un nuevo TO DO.
En el caso de "Consultar Todos los TO DO's" Cada VU (usuario virtual) hace una petición GET al endpoint que devuelve la lista completa de TO DO's. Lo relacionado a "Consultar un TO DO Específico" cada VU elige aleatoriamente un TO DO y realiza otra petición GET para consultar los detalles de ese TO DO en particular. Por ultimo, lo relacionado a "Crear un Nuevo TO DO", cada VU hace una petición POST al endpoint para crear un nuevo TO DO, enviando un objeto JSON con un título y una descripción aleatoria.

En la carpeta IMagenes de la raiz del proyecto se evidencian distintos momentos de la ejecución del caso de prueba: el inicio, primera parte de la ejecucion, ultimas partes de la ejecución y el fin de la ejecución. Todo esto con la información de la terminal, imagen de la terminal con la ejecucion en tiempo real, graficas del dashboard de grafana y log de estado de docker.
