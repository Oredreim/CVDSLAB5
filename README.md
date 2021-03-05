# CVDSLAB5

## Parte I. - Jugando a ser un cliente HTTP
### 1. Abra una terminal Linux o consola de comandos Windows.
### 2. Realice una conexión síncrona TCP/IP a través de Telnet al siguiente servidor:
- Host: www.escuelaing.edu.co
- Puerto: 80
- Teniendo en cuenta los parámetros del comando telnet: `telnet HOST PORT`

### 3. Antes de que el servidor cierre la conexión por falta de comunicación:
- Revise la página 36 del RFC del protocolo HTTP, sobre cómo realizar una petición GET. Con esto, solicite al servidor el recurso ‘sssss/abc.html’, usando la versión 1.0 de HTTP.
- Asegúrese de presionar ENTER dos veces después de ingresar el comando.
- Revise el resultado obtenido. ¿Qué codigo de error sale?, revise el significado del mismo en la lista de códigos de estado HTTP.
- ¿Qué otros códigos de error existen?, ¿En qué caso se manejarán?

Al ejecutar el comando del paso anterior, vemos que no podemos ver lo que escribimos, junto con la consola de comandos de Windows negra totalmente.  Después, vemos que aparece el error 400, que representa Bad Request o una solicitud incorrecta, que significa que el servidor no puede o no procesará la solicitud debido a un aparente error del cliente. 
