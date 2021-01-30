package ListaDobleEnlace;

import java.util.Scanner;
//BRYAN AXEL HERNANDEZ GAMA
//INGENIERIA SISTEMAS COMPUTACIONALES
//LISTA DOBLE ENLACE
public class Main {

    public static void main(String[] args) {

        ListaDoble lista= new ListaDoble();
        Scanner sc= new Scanner(System.in);
        int opcion,numero;
        //Esta es una aplicacion para introducir numeros
        do {
            System.out.println("\u001B[35m--Introduce el numero de la operacion a hacer--\u001B[0m");
            System.out.println("1.Insertar principio");
            System.out.println("2.Insertar final");
            System.out.println("3.Insertar un dato despues de una nodo");
            System.out.println("4.Eliminar cualquier nodo mediante una referencia ");
            System.out.println("5.Imprimir la lista de inicio fin");
            System.out.println("6.Imprimir la lista de fin a inicio");
            System.out.println("7.Buscar una dato en la lista");
            System.out.println("8.Salir de la aplicacion");
            opcion=sc.nextInt();

            switch (opcion){
                case 1://Insertar inicio
                    System.out.println("Introduce el dato");
                    numero=sc.nextInt();
                    lista.insertaralFrente(numero);
                    break;
                case 2://Insertar al final de la lista
                    System.out.println("\u001B[35m--Introduce el numero--\u001B[0m");
                    numero= sc.nextInt();
                    lista.insertaralFinal(numero);
                    break;
                case 3:
                    System.out.println("Introduce la referencia del nodo");
                    int referencia=sc.nextInt();
                    System.out.println("Introduce el valor a insertar");
                    int valor=sc.nextInt();
                    lista.referencia(referencia,valor);
                    break;
                case 4:
                    System.out.println("Introduce la referencia del dato a eliminar");
                    int eliminacion=sc.nextInt();
                    lista.eliminar(eliminacion);
                    break;
                case 5:
                    lista.VisualizarIF();
                    break;
                case 6:
                    lista.VisualizarFI();

                    break;
                case 7:
                    System.out.println("Introduce el valor a buscar en la lista");
                     valor=sc.nextInt();
                     lista.busqueda(valor);
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default :
                    System.out.println("Error numero fuera del rango");
                    break;
            }
        }while (opcion!=8);

    }
}
