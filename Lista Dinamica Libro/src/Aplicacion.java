import java.util.Scanner;
public class Aplicacion {

    public static void main(String args[]){
        int numero,opcion;
        Scanner sc= new Scanner(System.in);

        do {
            System.out.println("--Introduce el numero de la funcion a hacer--");
            System.out.println("1.Insertar un dato al inicio de la lista");
            System.out.println("2.Insertar un dato al final de la lista");
            System.out.println("3.Insertar un dato al final o despues");
            System.out.println("4.Eliminar el primer nodo ");
            System.out.println("5.Eliminar el ultimo nodo");
            System.out.println("6.Eliminar un nodo en especifico");
            System.out.println("7.Imprimir la lista de inicio fin");
            System.out.println("8.Buscar un valor en la lista");
            System.out.println("9.Salir de la aplicacion");
            opcion=sc.nextInt();
            Lista lista= new Lista();

            switch (opcion){
                case 1://Insertar inicio
                    System.out.println("Introduce el dato");
                    numero=sc.nextInt();
                    lista.insertarInicio(numero);
                    break;
                case 2://Insertar final
                    System.out.println("Introduce el dato");
                    numero=sc.nextInt();


                    break;
                case 3://Insertar despues

                    System.out.println("Introduce el dato");
                    numero=sc.nextInt();

                    break;
                case 4://Eliminar primero nodo

                    break;
                case 5://Eliminar ultimo nod

                    break;
                case 6://Eliminar especifico

                    break;
                case 7://Imprimir la lista
                    System.out.println("Los elemento de la lista son");
                    lista.verlista();

                    break;
                case 8://buscar el valor en la lista


                    break;
                case 9://Salir de la aplicacion
                    System.out.println("Saliendo de la aplicacion...");
                    break;
                default :
                    System.out.println("Numero no valido");
                    break;
            }
        }while (opcion!=9);
    }
}
