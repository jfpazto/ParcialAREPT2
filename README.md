# Parcial Segundo Tercio
# Jonathan Fabian Paez Torres

Diseñe, construya y despliegue los siguientes servicios en un microcontenedor docker desplegado en una instancei a EC2 de AWS. Cada estudiante debe seleccionar para desarrollar dos funciones matemáticas de acuerdo a los dos últimos dígitos de su cédula como se especifica en la lista. Todas las funciones reciben un solo parámetro de tipo "Double" y retornan una prámetro sde tipo "Double".

0. log
1. ln
2. sin
3. cos
4. tan
5. acos
6. asin
7. atan
8. sqrt
9. exp (el número de eauler elevado ala potendia del parámetro)

Teniendo en cuenta los ultimos dos numeros de la cedula las funciones a implementar son:

## log

## asin

Implemente los servicios para responder al método de solicitud HTTP GET. Deben usar el nombre de la función especificado en la lista y el parámetro debe ser pasado en la variable de query con nombre "value".

Ejemplo de una llamado:

https://amazonxxx.x.xxx.x.xxx:{port}/cos?value=3.141592

Salida. El formato de la salida y la respuesta debe ser un JSON con el siguiente formato

{
 "operation": "cos",
 "input":  3.141592,
 "output":  -0.999999
}

## Requisitos
Para la realización y ejecución tanto del programa como de las pruebas de este, se requieren ser instalados los siguientes programas:
## * Maven
## * GIT
## * Docker
## * AWS


## Instalación

Ejecutar el siguiente comando para clonar el repositorio

```
git clone https://github.com/Skullzo/AREP-Parcial2.git
```

## Ejecución
Para compilar el proyecto utilizando la herramienta Maven, nos dirigimos al directorio donde se encuentra alojado el proyecto, y dentro de este ejecutamos en un Shell o Símbolo del Sistema el siguiente comando:

```
mvn clean
```

```
mvn package
```

### Docker

Se puede ver que el contenedor de docker esta desplegado correctamente.

![img](https://github.com/jfpazto/ParcialAREPT2/blob/master/images/docker1.PNG)


### AWS
Para comprobar que el servicio en AWS esta corriendo correctamente se debe ingresar la siguiente URL:http://ec2-100-24-206-193.compute-1.amazonaws.com:8000/lee?operation=asin&number=3.14

en el query operation se especifica la funcion a realizar en este caso se prueba con asin:

![img](https://github.com/jfpazto/ParcialAREPT2/blob/master/images/asin%20despliegue.PNG)

para este otro caso se prueba con log en operation




## Autor
Jonathan Fabian Paez Torres
## Licencia & Derechos de Autor

Licencia bajo la [GNU General Public License](https://github.com/jfpazto/ParcialAREPT2/blob/master/LICENSE).
