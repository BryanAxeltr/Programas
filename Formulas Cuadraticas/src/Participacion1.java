import javax.swing.JOptionPane;
public class Participacion1 {
    //Julia Ramos Lopez
    public static void main(String[] args) {
        //Iniciacion de las variables
        String[] arreglo = new String[3];
        double a=0,b=0,c=0,resultado=0,x1,x2;
        int i;



        //Ciclo que va removiendo un lugar del arreglo
        for (i=0;i<3;i++){
            arreglo[i]=JOptionPane.showInputDialog("Introduce el valor de a , b , c");
        }
        //Variables en donde se guarda el valor introducido
        a=Double.parseDouble(arreglo[0]);
        b=Double.parseDouble(arreglo[1]);
        c=Double.parseDouble(arreglo[2]);
        //Resultado de la operacion en la formula general
        resultado=(Math.pow(b,2)-(4*a*c));
        //Si el resultado es menor o igual a cero el valor discriminante es 0
        if (resultado<=0){
            JOptionPane.showMessageDialog(null, "El valor del discriminante es 0 " + resultado);
        }
        else{//Sino Imprimera los valores de x1 y x2
             x1=((-b)+Math.sqrt(resultado))/(2*a);
             x2=((-b)-Math.sqrt(resultado))/(2*a);
            JOptionPane.showMessageDialog(null, "El valor de x1 es:"+x1+"\nEl valor de x2 es:"+x2);

        }
    }

}
