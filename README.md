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

#### Error 401: Unauthorized:
Forbidden, pero específicamente para usar cuando se requiere autenticación y ha fallado o aún no se ha proporcionado. La respuesta debe incluir un campo de encabezado WWW-Authenticate que contenga un desafío aplicable al recurso solicitado. Consulte Autenticación de acceso básica y Autenticación de acceso Digest. 401 semánticamente significa "no autorizado", el usuario no tiene credenciales de autenticación válidas para el recurso de destino.

#### Error 402: Payment Required:
Reservado para uso futuro. La intención original era que este código se pudiera usar como parte de alguna forma de efectivo digital o esquema de micropagos, como lo propuso, por ejemplo, GNU Taler, pero eso aún no ha sucedido y este código no se usa ampliamente. La API de Google Developers usa este estado si un desarrollador en particular ha superado el límite diario de solicitudes. Sipgate usa este código si una cuenta no tiene fondos suficientes para iniciar una llamada. Shopify usa este código cuando la tienda no ha pagado sus tarifas y está temporalmente inhabilitada. Stripe usa este código para pagos fallidos donde los parámetros eran correctos, por ejemplo, pagos fraudulentos bloqueados.

#### Error 403: Forbidden:
La solicitud contenía datos válidos y fue entendida por el servidor, pero el servidor rechaza la acción. Esto puede deberse a que el usuario no tiene los permisos necesarios para un recurso o necesita una cuenta de algún tipo, o al intentar una acción prohibida (por ejemplo, crear un registro duplicado donde solo se permite uno). Este código también se usa normalmente si la solicitud proporcionó autenticación respondiendo al desafío del campo de encabezado WWW-Authenticate, pero el servidor no aceptó esa autenticación. La solicitud no debe repetirse.

#### Error 404: Not Found:
No se pudo encontrar el recurso solicitado, pero es posible que esté disponible en el futuro. Se permiten solicitudes posteriores por parte del cliente.

