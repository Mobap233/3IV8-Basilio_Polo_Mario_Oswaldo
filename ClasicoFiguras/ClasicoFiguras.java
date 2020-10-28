import java.util.Scanner;

class ClasicoFiguras{

/*
Vamos a crear un programa en el cual se pueda elegir calcular
el area o el perimetro de las sicguientes figuras
triangulo
cuadrado
circulo.
*/

public static void main(String[] args){

    //Instancia de nuestro objeto
    Scanner entrada = new Scanner (System.in);

    // variables

    int base, altura, opcion, perimetro,apotema,lado;
    char letra;
    //char es le tipo de dato y letra es el nombre de la 
    //variable
    double resultado,perimetro2;

    do{

    
    // el cuerpo del programa
    System.out.println("Eliga la opcio deseada: ");
    System.out.println("1.- Calcular el area de un cuadrado: ");
    System.out.println("2.- Calcular el area de un triangulo: ");
    System.out.println("3.- Calcular el area de un circulo: ");
    System.out.println("4.- Calcular el area de un rectangulo: ");
    System.out.println("5.- Calcular el area de un pentagono: ");
    System.out.println("6.- Salir: ");

    // asignar La opción

    opcion = entrada.nextInt();

    // segun, porque vamos a dar opciones.

    switch (opcion) {
        case 1:
            // aqui es donde realizamos las operaciones

            System.out.println("Ingrese el valor del lado");
            base = entrada.nextInt();

            

            perimetro = 4*base ;

            resultado = base*base;


            System.out.println("El area del cuadrado es: " + resultado);

            System.out.println("El perimetro del cuadrado: " + perimetro);

            break ;

        case 2:

            System.out.println("Ingresa el valor de la base");
            base = entrada.nextInt();

            System.out.println("Ingresa el valor de la altura");
            altura = entrada.nextInt();
             
            perimetro = 3*base ;
        
            resultado = (base * altura) / 2 ;

            System.out.println("El area del del triangulo es: " + resultado);

            System.out.println("El perimetro del triangulo es:  " + perimetro);

            break ;


        case 3:

            System.out.println("Ingresa el valor del radio");
            base = entrada.nextInt();

            perimetro2 = 6.2832 * base;

            resultado =  3.1416 *base *base;

           System.out.println("El area del circulo es de: " + resultado);

           System.out.println("El perimetro del circulo es: " + perimetro2);

           
    
            break;
        
        case 4:

            System.out.println("Ingresa el valor de la base");
            base = entrada.nextInt();

            System.out.println("Ingresa el valor de la altura");
            altura = entrada.nextInt();

            perimetro = 2*base + 2*altura;

            resultado = base*altura;

            System.out.println("El area del rectangulo es de: " + resultado);

            System.out.println("El perimetro del rectangulo es de: " + perimetro);
        
            break;

        case 5:

            System.out.println("Ingresa el valor del lado");
            lado = entrada.nextInt();

            System.out.println("Ingresa el valor de la apotema");
            apotema = entrada.nextInt();

            perimetro = 5*lado;

            resultado = perimetro * apotema / 2;

            System.out.println("El area del pentagono es: " + resultado);

            System.out.println("El perimetro del pentagono: " +  perimetro);

            break;
             
        default:
        System.out.println("Gracias por usar este algoritmo");
        
    }
    System.out.println("¿Desea que el programa ser repita? si es asi presione s");
    //recibir una respuesta de si no
    //se utilizara un booleano o char s

    letra = entrada.next().charAt(0);
    /*
    Si utilizamos char se usa ''
    Si utilizamos Stringse usa ""
    numero de caracteres = 1  1 + 1 = 11
    */

    }while(letra == 's');

}
}

