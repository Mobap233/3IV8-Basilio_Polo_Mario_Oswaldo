import java.util.Scanner;

class Pokedex{

    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        int numero,pokemon,bulbasour,charmander,squirtle;
        char letra;



        do{
            System.out.println("Algoritmo de 3IV8_Examen_Basilio_Polo_Mario_Oswaldo");
            System.out.println("1.- Consultar atributos pokemon 1 Charmander");
            System.out.println("2.- Consultar atributos pokemon 2 Bulbasour");
            System.out.println("3.- Consultar atributos pokemon 3 Squirtle");
            System.out.println("4.- Opcion Batalla:");
            System.out.println("5.- Salir de la Pokedex");
            pokemon = entrada.nextInt(); 

            
            

            switch (pokemon) {
                case 1:


                System.out.println("Energia Vital : 1 Fuego");
                System.out.println("Id Charmander : 002 ");
                System.out.println("Fuerza : 340 ");
                System.out.println("Defensa : 270 ");
                System.out.println("Vida : 750 HP ");
                System.out.println("Ataque Principal : Llamarada ignea ");
                System.out.println("Ataque Secundario : Placaje  ");

                    break;
                
                case 2:

                System.out.println("Energia Vital : 2 Hierba");
                System.out.println("Id Bolubasour: 003");
                System.out.println("Fuerza : 450 ");
                System.out.println("Defensa : 320 ");
                System.out.println("Vida : 760 HP");
                System.out.println("Ataque Principal : Hojas Navaja");
                System.out.println("Ataque secundario : Placaje");


                    break;

                case 3:

                System.out.println("Energia Vital : 3 Agua");
                System.out.println("Id Squirtle : 004");
                System.out.println("Fuerza : 560");
                System.out.println("Defensa : 320");
                System.out.println("Vida : 730 HP");
                System.out.println("Ataque Principal : Cañon de Agua");
                System.out.println("Ataque Secundario: Placaje");


                break;


                case 4:

                do{

                System.out.println("Para batallar escoja un numero del 1 al 3");
                
                numero = entrada.nextInt();


                if(numero == 1){

                    System.out.println("El ganador de la batalla es Charmander");

                    System.out.println("Derroto a Bulbasour con llamarada Ignea");

                    System.out.println("Bulbasour se debilito");
                }
             

                if (numero == 2){
                    System.out.println("El ganador de la batalla es Bulbasour");

                    System.out.println("Derroto a Squirtle con Hojas navajas");

                    System.out.println("Squirtle se debilito");
                }
                

                if (numero == 3){

                    System.out.println("El ganador de la batalla es Squirtle");

                    System.out.println("Derroto a Charmander con Cañon agua ");

                    System.out.println("Charmander se debilito");

                }
            
                else{

                    System.out.println("Vuelva a introducir un numero del 1 al 3");
                }

                System.out.println("Para volver a batallar escribe la letra b");

                letra = entrada.next().charAt(0);


            } while (letra == 'b');

                break;
                
            
                default: 
                System.out.println("Gracias por usar nuestra pokedex Se un buen entranador pokemon");
                    break;
            }

            System.out.println("¿Desea que el programa se repita? si es asi presione v");

            letra = entrada.next().charAt(0);


        }while (letra == 'v');












    }


















}