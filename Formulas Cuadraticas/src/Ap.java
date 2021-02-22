import javax.swing.*;

public class Ap {
    public static void main(String []args){
        // TODO code application logic here

        String num= JOptionPane.showInputDialog("Introduce el valor de a , b , c \n (separar por un / : a/b/c)");


        String[] parts = num.split("/"); //el metodo split es para reconocer un simbolo
        String a1= parts[0]; // creamos un arreglo , yo no quise hacer un ciclo la verdad olvide como se hacia
        String b1= parts[1];
        String c1= parts[2];

        double a=Double.parseDouble(a1);
        double b=Double.parseDouble(b1);
        double c=Double.parseDouble(c1);

        double p=(Math.pow(b, 2)-(4*a*c));

        if (p<=0){// aqui checamos si la potencia es menor o igual a 0 lo cual nos haria un numero imaginario
            JOptionPane.showMessageDialog(null, "El valor del discriminante es 0 " + p);

        }
        if (p>0){ // aqui es por si es mayor
            double x1=((-b)+Math.sqrt(p))/(2*a);
            double x2=((-b)-Math.sqrt(p))/(2*a);

            JOptionPane.showMessageDialog(null, "El valor de x1 es:"+x1+"\nEl valor de x2 es:"+x2);

        }
    }

}
