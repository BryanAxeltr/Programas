package Racional;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Bryan Axel Hernandez Gama
        //No.19071579


        Scanner sc = new Scanner(System.in);
        int opcion;

        Racional racional = new Racional();
        do {
            System.out.println("\u001B[35m--Introduce el numero de la operacion a hacer--\u001B[0m");
            System.out.println("\u001B[35m--Operacion con dos fracciones--\u001B[0m");
            System.out.println("\u001B[35m--Bryan Axel Hernandez Gama--\u001B[0m");
            System.out.println("1.Sumar dos fracciones");
            System.out.println("2.Division de dos fracciones");
            System.out.println("3.Resta de dos fracciones");
            System.out.println("4.Multiplicacion de dos fracciones");
            System.out.println("5.Salir de la aplicacion");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el numerador");
                    int numerador=sc.nextInt();

                    System.out.println("Introduce el denominador");
                    int denominador=sc.nextInt();

                    System.out.println("Introduce el numerador 2");
                    int numerador2=sc.nextInt();

                    System.out.println("Introduce el denominador 2");
                    int denominador2=sc.nextInt();
                    System.out.println(racional.sumaRacional(numerador,denominador,numerador2,denominador2));

                    break;
                case 2:
                    System.out.println("Introduce el numerador");
                     numerador=sc.nextInt();

                    System.out.println("Introduce el denominador");
                    denominador=sc.nextInt();

                    System.out.println("Introduce el numerador 2");
                    numerador2=sc.nextInt();

                    System.out.println("Introduce el denominador 2");
                    denominador2=sc.nextInt();
                    System.out.println(racional.divisionRacional(numerador,denominador,numerador2,denominador2));

                    break;
                case 3:

                    System.out.println("Introduce el numerador");
                    numerador=sc.nextInt();

                    System.out.println("Introduce el denominador");
                    denominador=sc.nextInt();

                    System.out.println("Introduce el numerador 2");
                    numerador2=sc.nextInt();

                    System.out.println("Introduce el denominador 2");
                    denominador2=sc.nextInt();
                    System.out.println(racional.restaRacional(numerador,denominador,numerador2,denominador2));

                    break;
                case 4:
                    System.out.println("Introduce el numerador");
                    numerador=sc.nextInt();

                    System.out.println("Introduce el denominador");
                    denominador=sc.nextInt();

                    System.out.println("Introduce el numerador 2");
                    numerador2=sc.nextInt();

                    System.out.println("Introduce el denominador 2");
                    denominador2=sc.nextInt();
                    System.out.println(racional.mulRacional(numerador,denominador,numerador2,denominador2));

                    break;

                default:

                    break;
            }
        } while (opcion != 5);

    }
}
