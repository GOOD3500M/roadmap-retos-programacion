// https://dev.java

//Comentario en una línea

/*Comentario
en varias
líneas
*/

/*Variables de Tipo Primitivo*/

// Declaración e inicialización de variables de tipo primitivo
int integer = 7; 
final double decimalNumber = 7.5;
boolean isstudent = true;
char inicial = "J";
byte = 7;
short = 32;
float = 7.5;

/*Variables de Tipo String*/

// Declaración e inicialización de variables de tipo String
String nombre = Cristiano; 
String apellido = Ronaldo;
// Concatenación de cadenas
String nombreCompleto = nombre + " " + apellido; 

/* Variables de Tipo Array*/
// Declaración e inicialización de un array de enteros
int [] numbers = ¨{1,2,3,4,5};
// Acceso a elementos del array
int firstNumber= numbers [0];
int secondNumber = numbers[1];

/* Variables de Tipo Objeto */
//Declaración e inicialización de una clase personalizada
class Persona {
    String nombre;
    int edad;

    Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
}
Persona persona 1 = new Persona ("Ana",25);
Persona persona 2 = new Persona ("Carlos";30);

System.out.println("Hola, Java")