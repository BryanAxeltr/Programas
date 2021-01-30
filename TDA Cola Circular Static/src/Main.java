import java.util.Scanner;
//Bryan Axel Hernandez Gama
//Carrera Sistemas Computacionales

public class Main {
    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);
        int opcion;

        ColaCircular cola= new ColaCircular();

        do {
            System.out.println("\u001B[32mIntroduce la opcion a realizar \u001B[0m");
            System.out.println("Recorrer arbol en:");
            System.out.println("1.-Insertar");
            System.out.println("2.-Eliminar");
            System.out.println("3.-Saber si la cola esta vacia");
            System.out.println("4.Saber si la cola esta llena");
            System.out.println("5.Vaciar la cola");
            System.out.println("6.Buscar un valor");
            System.out.println("7.Imprimir la cola");
            System.out.println("8.Saber la cantidad de elementos en la cola");
            System.out.println("9.Primer elemento de la cola");
            System.out.println("10.Salir de la aplicacion");
            opcion=sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el valor a introducir");
                    int valor=sc.nextInt();

                    cola.insertar(valor);
                    break;
                case 2:
                    if (!cola.colaVacia()){
                        cola.quitar();
                    }
                    else {
                        System.out.println("La cola esta vacia");
                    }
                    break;
                case 3:
                    if (cola.colaVacia()){
                        System.out.println("La cola esta vacia");
                    }else {
                        System.out.println("La cola contiene datos");
                    }

                    break;
                case 4:
                    if (cola.colaLlena()){
                        System.out.println("La cola esta llena");
                    }else{
                        System.out.println("Contiene espacios vacios");
                    }

                    break;
                case 5:
                    if (!cola.colaVacia()){
                        cola.borraCola();
                    }
                    else {
                        System.out.println("La cola se encuentra ya vacia");
                    }
                    break;
                case 6:
                    if (!cola.colaVacia()){
                        System.out.println("Introduce el dato a buscar");
                        valor=sc.nextInt();
                        if (cola.buscarcola(valor)){
                            System.out.println("El valor se encuentra en la cola");
                        }
                        else{
                            System.out.println("El valor no se encuentra en la cola");
                        }
                    }else {
                        System.out.println("La cola se encuentra vacia");
                    }

                    break;

                case 7:
                    if (!cola.colaVacia()){
                        cola.imprimirCola();
                    }else {
                        System.out.println("La cola esta vacia");
                    }

                    break;
                case 8:
                    if (cola.colaVacia()){
                        System.out.println("No hay datos");
                    }else {
                        cola.contador(3);
                    }
                    break;
                case 9:
                    if (!cola.colaVacia()){
                        System.out.println( cola.frenteCola());
                    }else {
                        System.out.println("La cola se encuentra vacia");
                    }
                    break;
                case 10:
                    System.out.println("Saliendo de la aplicacion...");
                    break;
                default:
                    System.out.println("Error con el valor introducido");
                    break;
            }

        }while (opcion < 10);






    }
}
