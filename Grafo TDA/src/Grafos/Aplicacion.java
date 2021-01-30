package Grafos;
import java.util.Scanner;
public class Aplicacion {

    public static void main(String [] args) throws Exception {
        String n,a,b;
        Scanner sc= new Scanner(System.in);
        GrafoMatriz matriz= new GrafoMatriz();
        int opcion;
        do {
            System.out.println("\u001B[35m--Introduce el numero de la operacion a hacer--\u001B[0m");
            System.out.println("1.Crea un grafo vacio");
            System.out.println("2.Inicializar el grafo");
            System.out.println("3.Insertar Aristas");
            System.out.println("4.Insertar Vertices");
            System.out.println("5.Eliminar Vertices");
            System.out.println("6.Eliminar Aristas");
            System.out.println("7.Grafo vacio");
            System.out.println("8.Adyacencia");
            System.out.println("9.Imprimir grafo");
            opcion=sc.nextInt();

            switch (opcion){
                case 1:

                    break;
                case 2:
                    break;

                case 3:
                    System.out.println("Letra de referencia");
                    a=sc.next();
                    System.out.println("Letra de referencia");
                    b=sc.next();
                    matriz.nuevoArista(a,b);
                    break;
                case 4:
                    System.out.println("Inserta el vertice");
                    n=sc.next();
                    matriz.numVertices(n);
                    break;
                case 5:

                    break;
                case 6:
                    break;
                case 7:
                    matriz.grafoVacio();
                    break;
                case 8:
                    System.out.println("Letra de referencia");
                    a=sc.nextLine();
                    System.out.println("Letra de referencia");
                    b=sc.nextLine();
                    matriz.adyacente(a,b);
                    break;
                default :

                    break;
            }
        }while (opcion!=8);




    }


}
