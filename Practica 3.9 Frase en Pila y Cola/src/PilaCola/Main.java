package PilaCola;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        Cola cola= new Cola();




        System.out.println("Introdusca la frase");
        String frase=sc.nextLine();

        for (int i=0;i<frase.length() ; ) {

            Character c = new Character(frase.charAt(i++));			//
            cola.insertar(c);
        }




    }
}
