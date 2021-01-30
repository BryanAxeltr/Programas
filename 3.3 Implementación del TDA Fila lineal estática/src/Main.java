import java.util.Scanner;
public class Main {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int opcion;

    Operaciones operaciones= new Operaciones();
        System.out.println("Introduce el tamaño de la fila");
        int tamaño= sc.nextInt();
        operaciones.Operaciones(tamaño);

    do {
        System.out.println("--Introduce el numero de la operacion a hacer--");
        System.out.println("1.Insertar un dato");
        System.out.println("2.Eliminar un dato");
        System.out.println("3.Informacion de la cola");
        System.out.println("4.Verificar si la cola esta vacia");
        System.out.println("5.Verificar si la cola esta llena");
        System.out.println("6.Buscar en la cola");
        System.out.println("7.Mostrar los elementos de la cola");
        System.out.println("8.Total de elementos de la cola");
        System.out.println("9.Salir del la aplicacion");
         opcion=sc.nextInt();

        switch (opcion){
            case 1://Introduce un dato
                System.out.println("Introduce el numero a insertar");
                int numero=sc.nextInt();
                operaciones.insertar(numero);
                break;
            case 2://Elimina un dato
                if (!operaciones.filaVacia())
                operaciones.quitar();
                else
                    System.out.println("Cola vacia");
                break;
            case 3://Muestra el valor que esta en la cima
                if (!operaciones.filaVacia()){
                System.out.println(operaciones.info());
                }else {
                    System.out.println("La cola esta vacia");
                }
                break;
            case 4://Verifica si la cola esta vacia
               if(operaciones.filaVacia()){
                   System.out.println("La fila esta vacia");
            }
               else{
                   System.out.println("La fila contiende datos");
               }
                break;
            case 5://Verifica si la cola esta llena
                if (operaciones.filaLlena()){
                    System.out.println("La fila esta llena");
                }else{
                    System.out.println("La fila tiene espacios");
                }
                break;
            case 6://Busca en la cola
                System.out.println("Introduce el numero a buscar");
                numero=sc.nextInt();
                if (!operaciones.filaVacia()) {
                    if (operaciones.buscar(numero)) {
                        System.out.println("Se a encontrado el dato");
                    } else {
                        System.out.println("El dato no se encuentra");
                    }
                }
                break;
            case 7://Muestra los elementos de la pila

                if (!operaciones.filaVacia()){
                    operaciones.mostrarFila();
                }else{
                    System.out.println("La cola esta vacia");
                }
                break;
            case 8://Total de elementos en la cola
                if (!operaciones.filaVacia()){
                    System.out.println("El total de elementos en la cola son: "+operaciones.contador());}
                else {
                    System.out.println("La pila esta vacia");
                }
                break;
            case 9://Se sale de la aplicacion
                System.out.println("Saliendo de la aplicacion...");
                break;
            default :
                System.out.println("Numero no valido");
                break;
        }
    }while (opcion!=9);


    }
}
