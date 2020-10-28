import java.util.Scanner;

class SumaNumeros{

    public static void main(String[] args){

// vamos a crear un programa que se encargue de sumar 2 
// números

//Instancia del Objeto

Scanner entrada = new Scanner(System.in);


//Variables
int num1, num2, resultado;

System.out.println("Ingrese el primer numero: ");
num1 = entrada.nextInt();
System.out.println("Ingrese el segundo numero: ");
num2 = entrada.nextInt();


resultado = num1 + num2;

System.out.println("La suma de los resultados es: " +resultado);


    }
}