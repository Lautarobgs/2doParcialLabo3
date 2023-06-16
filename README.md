# 2doParcialLabo3
Segundo parcial
IMPORTANTE:
Agregar como comentarios sus datos personales al comienzo del main. DNI, apellido,
nombre y comisión.
Un ejercicio recibirá el puntaje completo si cumple con las siguientes condiciones:
• Nombres descriptivos, tanto para las variables como para las funciones creadas
• EL PROYECTO DEBE COMPILAR.
Recomendaciones:
• Se tendrá en cuenta la prolijidad del código. Respetar la indentación.
• Utilizar comentarios para separar un ejercicio de otro en el main.
• Recuerde crear los getters, setters y constructores necesarios.
• Utilice el autocompletado para ahorrar tiempo.
Resumen de la propuesta:
Desarrolla un juego de preguntas y respuestas utilizando Java. A modo de resumen el
juego consiste en:
1. cargar preguntas, respuestas en un map.
2. Añadir esas preguntas al juego
3. Iniciar el juego
a. El usuario debe ir contestando las preguntas
b. El juego va almacenando aciertos y errores
4. Guardar los aciertos y errores en un archivo binario o json (seleccione el más
conveniente para usted)
5. Mostrar el resultado, pero leyendo desde el archivo
El juego constará de las siguientes características:
1. Debes implementar una clase abstracta llamada "Pregunta" que contenga los
siguientes atributos:
• Enunciado: String
• RespuestaCorrecta: String
Además, esta clase deberá tener los siguientes métodos:
• Un constructor para inicializar los atributos.
• Los métodos get y set que considere necesarios
• Un método abstracto llamado "verificarRespuesta" que tome como
parámetro una respuesta (String) y retorne un valor booleano indicando si la
respuesta es correcta o no. (15 puntos)Debes implementar al menos dos
Programación 3
clases concretas que hereden de la clase "Pregunta" para representar
diferentes tipos de preguntas. Por ejemplo:
• PreguntaMultipleChoice: Una pregunta con varias opciones de respuesta,
donde solo una es correcta.
o Implementar Excepciones: verificar si la lista de opciones es nula o
vacía y en caso de que lo sea debería lanzar una excepción
• PreguntaVerdaderoFalso: Una pregunta con dos opciones de respuesta
(verdadero o falso).
o Implementar Excepciones: verifica si la respuesta correcta es
diferente de "verdadero" o "falso" (ignorando mayúsculas y
minúsculas) y se lanza una excepción
• Cada clase concreta deberá implementar el método "verificarRespuesta" de
acuerdo con sus reglas específicas. Tenga en cuenta que la respuesta
correcta siempre es un string según la clase padre (25 puntos)
2. Debes implementar una clase llamada "Juego" que maneje la lógica del juego.
Esta clase deberá tener una lista de preguntas, donde se almacenarán las
instancias de las clases concretas que creaste.
La clase "Juego" deberá tener los siguientes métodos:
• Constructor.
• Un método para cargar las preguntas desde un archivo de texto o archivo
serializado.
• Un método para mostrar una pregunta al jugador y recibir su respuesta.
• Un método para verificar si la respuesta es correcta y mostrar un mensaje
correspondiente.
• El método iniciar el juego.
• Un método para llevar la cuenta de los aciertos y errores del jugador.
• El método mostrar resultado desde el archivo.
• El método guardar resultado en el archivo. (50 puntos)
3. Debes implementar una clase "Main" donde se ejecutará el juego. En esta clase,
deberás crear una instancia de la clase "Juego" y llamar a los métodos
correspondientes para iniciar y jugar el juego.
a. Utiliza las colecciones Set o Map para almacenar y gestionar las
preguntas dentro del juego.
b. Asegúrate de manejar adecuadamente las excepciones en el proceso de
carga de preguntas desde el archivo y en la interacción con el jugador.
c. Si deseas agregar, funcionalidades y mejoras según tus necesidades y
creatividad, informar cuales son las mismas para ser tenidas en cuenta.
(10 puntos)
