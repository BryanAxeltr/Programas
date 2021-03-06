package arbolBinario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArbolBB<Integer> arbolBB= new ArbolBB<>();

        int opcion;
        int i=0;
        int valor;
        Scanner sc= new Scanner(System.in);
        ArbolBB arbol= new ArbolBB();
        do {
            System.out.println("\u001B[32mIntroduce la opcion a realizar \u001B[0m");
            System.out.println("Recorrer arbol en:");
            System.out.println("1.-Preorden");
            System.out.println("2.-Inorden");
            System.out.println("3.-Postorden");
            System.out.println("4.Insertar nodo");
            System.out.println("5.Eliminar nodo");
            System.out.println("6.Salir de la aplicacion");
            opcion=sc.nextInt();
            switch (opcion) {
                case 1:
                    arbol.preorden(arbol.getRoot());
                    break;
                case 2:
                    arbol.inorden(arbol.getRoot());
                    break;
                case 3:
                    arbol.postorden(arbol.getRoot());
                    break;
                case 4:
                    System.out.println("Introduce el valor a insertar en el arbol");
                    valor = sc.nextInt();
                    arbol.Add(arbol.getRoot(),valor);
                    break;
                case 5:
                    System.out.println("Introduce el valor a eliminar");
                    valor=sc.nextInt();
                    arbol.eliminar(arbol.getRoot(),valor);

                    break;

                case 6:
                    System.out.println("Saliendo de la aplicacion");
                    break;
                default:
                    System.out.println("Error con el valor introducido");
                    break;
            }

        }while (opcion<6);

    }
    }
