import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        int op;
        Scanner sc= new Scanner(System.in);

        do {
            System.out.println("Introdusca la operacion a realizar");
            System.out.println("1.Crear un grafo");
            System.out.println("2.Inicializar el grafo");
            System.out.println("3.Insertar aristas");
            System.out.println("4.Insertar Vertices");
            System.out.println("5.Eliminar Vertices");
            System.out.println("6.Eliminar Aristas");
            System.out.println("7.Grafo Vacio");
            System.out.println("8.Adyacencia");
            System.out.println("9.Imprimir Grafo");
            op = sc.nextInt();

            switch (op) {
            }

        }while (op!=10 && op<11);
    }
}
