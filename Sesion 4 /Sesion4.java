import java.util.Scanner;

class Sesion4{

    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        int problema,precio,edad,numero,iterador,negativos,positivos,digito,exp,socios,entero,altura,base,perimetro;
        int valor,suma,opcion2,factorial;
        char letra;
        double abono,binario,volumen,radio,area,grados,conversion;
        do{

            System.out.println("Porfavor escriba su problema: ");
            System.out.println("1.- Problematica 1: ");
            System.out.println("2.- Problematica 2: ");
            System.out.println("3.- Problematica 3: ");
            System.out.println("4.- Problematica 4: ");
            System.out.println("5.- Problematica 5: ");
            System.out.println("6.- Problematica 6: ");
            System.out.println("7.- Problematica 7: ");
            System.out.println("8.- Problematica 8: ");
            System.out.println("13.- Problematica 13: ");
            System.out.println("9.- Salir ");

            problema = entrada.nextInt();
            
            switch (problema) {
                case 1:

                System.out.println( " Ingrese su edad (debe ser un entero positivo mayor o igual a 10 y menor o igual a 80) " );
                edad = entrada . nextInt ();
                if (edad >= 10 && edad <= 80 ) {
                    if (edad > 65 ) {
                        System.out.println ( " usted tiene un descuento de 45% " );
                    }
                    else {
                        if(edad < 21 ) {
                            System.out.println ( "¿ Sus papas son socios? Escriba una s si es cierto o una n si no " );
                            letra = entrada . next() . charAt ( 0 );
                            if (letra == 's' ) {
                                System.out.println ( " Su descuento es del 45% " );
                            }
                            else{
                                System.out.println  ( " Su descuento es del 25% " );
                            }
                        }
                        else {
                            System.out.println ( " Su descuento es del 25% " );
                        }
                    }
                }
                else {
                    System.out.println(" Usted ingreso una edad que no está dentro de los límites " );
                }
                        

                    

                    break;

                    case 2 : 

                    do{
                        System.out.println("Introduzca un numero mayor o igual a 0");
                        numero = entrada.nextInt();
                    }while(numero < 0);

                    exp = 0;
                    binario = 0;

                        while(numero != 0){

                        digito = numero % 2;
                        binario = binario + digito * Math.pow(10, exp);
                        exp ++;
                        numero = numero / 2;

                        }

                        System.out.printf("La conversion a numero binario es: " + binario);

                        

                    break;

                    case 3:     
                       
                           System.out.println("Por favor elija la conversion de grados");
                           System.out.println("1.- Grados Fahrenheit a grados Celius");
                           System.out.println("2.- Grados Fahrenheit a grados Kelvine");
                           System.out.println("3.- Grados Fahrenheit a grados Rankie");
                            problema = entrada.nextInt();

                            switch (problema) {
                                case 1:
                                System.out.println("Ingresa los grados Fahrenheit a convertir debe ser mayor o igual a -459.67");
                                    grados = entrada.nextDouble();

                                        if (grados >= -459.67){
                                            conversion = (grados - 32) * 5/9;
                                            System.out.println("La conversion de grados Fahrenheit a Celcius es de: " + conversion);
                                        }
                                        else{
                                            System.out.println("Los grados no se pueden convertir");
                                        }
                                    break;
                                case 2:
                                System.out.println("Ingresa los grados Fahrenheit a convertir debe ser mayor o igual a -459.67");
                                    grados = entrada.nextDouble();

                                        if (grados >= -459.67){
                                            conversion = ((grados - 32) / 1.8) + 273.15;
                                            System.out.println("La conversion de grados Fahrenheit a Kelvin es de: " + conversion);
                                        }

                                        else {
                                            System.out.println("Los grados no se pueden convertir");
                                        }
                                break;

                                case 3:
                                System.out.println("Ingresa los grados Fahrenheit a convertir debe ser mayor o igual a -459.67");
                                        grados = entrada.nextDouble();

                                        if (grados >= -459.67){
                                            conversion = grados + 459.67;
                                            
                                            System.out.println("La conversion de grados Fahrenheit a Rankie es de: " + conversion);

                                            }
                                        else {
                                            System.out.println("Los grados no se pueden convertir");  
                                        }
                                break;
                            
                                default:
                                    break;
                            }

                        
                    
                        
                    break;

                    case 4:

                    System.out.println("Ingrese un numero entero positivo");
                            numero = entrada.nextInt();
                            if(numero > 0){
                                iterador = numero;
                                positivos = 0;
                                negativos = 0;
                            while(iterador > 0) {

                                System.out.println("Ingrese un numero");
                                valor = entrada.nextInt ();
                                if (valor < 0){
                                    negativos ++;
                                }
                                else{
                                    if (valor > 0){
                                        positivos ++;
                                    }
                                
                                }
                               iterador -- ;  
                            }
                            System.out.println("El total de numeros negativos son: " + negativos);
                            System.out.println("El total de numeros positivos son: " + positivos);
                            
                            }
                            else {
                                System.out.println("No ingreso un numero entero positivo");
                            }
                            
                    break;

                    case 5:
                    
                    System.out.println("Por favor ingrese un numero entero positivo");
                            entero = entrada.nextInt();
                            numero = 0;
                            suma = 0;
                            if ( entero > 0 ){
                                iterador = entero;

                                    while (iterador > 0){
                                        System.out.println("Ingresa un cantidad mayor a 0");
                                            valor = entrada.nextInt ();
                                    
                                    if (valor > 0) {
                                        suma  = valor;
                                            numero ++ ;
                                    }
                                     iterador -- ;   
                                    }
                                    System.out.println("Compró" + numero + "articulos y el monto total de su compra es de " +suma);
                            }



                    break;
                       


                    case 6:

                        
                    
                        System.out.println("Eliga el problema deseada");
                        System.out.println("1.- Solicitar el area de un rectangulo");
                        System.out.println("2.- Solicitar el area de un triangulo");
                        System.out.println("3.- Solicitar el volumen de una esfera");
                        System.out.println("4.- Solicitar el volumen de un cilindro");

                        problema = entrada.nextInt();


                        
                       switch (problema) {
                           case 1: 
                           System.out.println("Por favor introduzca el valor de la base: ");
                               base = entrada.nextInt();
                            
                            System.out.println("Por favor introduzca el valor de la altura: ");
                                altura = entrada.nextInt();

                             area = base * altura;
                             perimetro = 2*base + 2*altura;

                            System.out.println("El area del rectangulo es: " + area);
                            System.out.println("El perimetro del rectangulo es: " + perimetro);
                               break;
                            
                            case 2: 
                            System.out.println("Por favor introduzca el valor de la base: ");
                               base = entrada.nextInt();
                            
                            System.out.println("Por favor introduzca el valor de la altura: ");
                               altura = entrada.nextInt();  

                               area = base * altura / 2;

                               perimetro= 3* base;

                            System.out.println("El area del rectangulo es: " + area);
                            System.out.println("El perimetro del rectangulo es: " + perimetro);

                            break;

                            case 3:

                            System.out.println("Porfavor introduzca el radio de la esfera: ");
                                radio = entrada.nextInt();

                            volumen = 4/3 * 3.1416*radio*radio*radio;

                            System.out.println("El volumen de la esfera es de: " + volumen);

                            break;

                            case 4:

                            System.out.println("Porfavor introduzca el radio de una de las circunferencias del cilindro: ");
                                radio = entrada.nextInt();
                            System.out.println("Porfavor introduzca la altura del cilindro: ");
                                altura = entrada.nextInt();
                            
                            volumen = 3.1416*radio*radio*altura;
                            
                            System.out.println("El volumen del cilindro es de: " + volumen);

                            break;
                            
                            default:
                            
                       }
                       
                    case 7:
                    System.out.println("\tN\t\t\t");
                    System.out.println("\t1\t10\t100\t1000");
                    System.out.println("\t2\t20\t200\t2000");
                    System.out.println("\t3\t30\t300\t3000");
                    System.out.println("\t4\t40\t400\t4000");
                    System.out.println("\t5\t50\t500\t5000");
                    System.out.println("\t6\t60\t600\t6000");
                    System.out.println("\t7\t70\t700\t7000");
                    System.out.println("\t8\t80\t800\t8000");
                    System.out.println("\t9\t90\t900\t9000");
                    System.out.println("\t10\t100\t1000\t1000");

                    
                    break;

                    case 8:
                       factorial = 1;
                    System.out.println("Ingrese un numero entero positivo menor o igual a 12");
                       numero = entrada.nextInt();
                       if (numero > 0 && numero <= 12){
                           iterador = numero;
                           while(iterador > 0){

                               factorial *= iterador;

                               iterador -- ;
                           }
                       System.out.println("El numero" + numero + "es igual a " + factorial);
                       
                       }
                       else{
                        System.out.println("No ingresaste un numero entero denro de los limites");
                       }
                    break;

                    
                    case 13:
                       System.out.println("Para salir de la calculadora presiona el 0");
                    System.out.println("Gracias por usar este algoritmo");
                    System.out.println("Ingrese el valor de su cuenta");
                    valor =  entrada.nextInt();
                    suma =  valor;
                    if (valor == 0){
                        System.out.println("Usted ingreso una cantidad de 0");
                    }
                    while(valor != 0){
                        System.out.println("Escoja una de las siguientes opciones");
                        System.out.println("1.- Multiplicaion");
                        System.out.println("2.- Division");
                        System.out.println("3.- Suma");
                        System.out.println("4.- Resta");
                        System.out.println("5.-salir");
                        opcion2 = entrada.nextInt();
                        System.out.println("Ingrese el valor a acumular de la cuenta");
                        System.out.println("Si desea salir de la calculadora debe de presionar el 0");
                        valor = entrada.nextInt();
                        if(valor != 0){
                            switch (opcion2) {
                                case 1:
                                suma *= valor;
                                System.out.println("El total de la cuenta hasta ahora es de " + suma);
                                    break;
                                case 2:
                                suma /= valor; 
                                System.out.println("El total de la cuenta hasta ahora es de " + suma);
                                break;
                                case 3:
                                suma += valor;
                                System.out.println("El total de la cuenta hasta ahora es de " + suma);
                                break;
                                case 4:
                                suma -= valor;
                                System.out.println("El total de la cuenta hasta ahora es de  " + suma);
                                break;
                            
                                default:
                                System.out.println("No escogio ninguna de las opciones anteriores");
                            }
                        }
                        else {
                            System.out.println("El total de la cuenta es de " + suma);
                        }


                    }
                    break;             
            }   
            
         

            
            System.out.println("¿Desea que el programa se repita? si es asi presione s");

            letra = entrada.next().charAt(0);
            
        } while(letra == 's');
    }
}

    

