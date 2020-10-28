/*
Como hemos visto en anteriores seciones es posible captar
la entrada de datos a partir del redline() que esun metodo
de la consola de entrada estandar de la computador; pero
que tal si quiero leerlo de una manera constante, para
ello necesito una libreria.
*/

//Libreria
import java.util.Scanner; //solo lo que se ocupa

import java.util.*; //Mandando llamar la libreria

class EntradaDatosUsuario{

    //metodo principal
    public static void main(String[] args){
        //a nuestro objeto o vamos a crear un instantaneo
        //invocación del objeto
        //Nombre de la clase

        Scanner entrada = new Scanner(System.in);


        //Variables

        String nombre;
        int edad;
        Float altura;

        System.out.println("Escribre tu nombre");
        nombre = entrada.nextLine();
        System.out.println("Escribe tu edad");
        edad = entrada.nextInt();
        System.out.println("Escribe tu estatura");
        altura = entrada.nextFloat();

        System.out.println("Tu nombre es: "+nombre);
        System.out.println("Tu edad es: "+edad);
        System.out.println("Tu altura es: "+altura);

    }
}