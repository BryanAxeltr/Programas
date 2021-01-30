import java.util.*;

public class Main {

    public static void main(String[] args) {

        String Expresion, postfija="";
        int i=0,cantidad=0;
        char simbolo,elemento;

        Scanner sc= new Scanner(System.in);

        System.out.println("Introduce la expresion");
        Expresion=sc.nextLine();
        while (cantidad<Expresion.length()){
            cantidad++;
        }
        InfijaPostfija Pila = new InfijaPostfija(cantidad);
        //Va ir metiendo los caracteres
        for(i=0;i<Expresion.length();i++){ // Los mete de a uno en uno
            simbolo=Expresion.charAt(i);	//La variable simbolo toma temporalmente el caracter que se almacena en la variable expresion
            //Compara si no es un operador
            if(!Pila.esOperador(simbolo)){
                postfija+=simbolo;}
                else{
                    if(simbolo != ')') {
                    if (Pila.pilaVacia()){
                    Pila.insertar(simbolo);}
                    else {
                        if (Pila.esmayor(Pila.Cima(), simbolo)){
                            Pila.insertar(simbolo);
                        }
                        if (Pila.esmenor(Pila.Cima(), simbolo)){
                              elemento= Pila.quitar();
                              postfija+=elemento;
                              Pila.insertar(simbolo);
                        }
                    }
                    }
                }
                         if (simbolo==')'){
                         do {
                        elemento=Pila.quitar();
                        postfija+=elemento;
                        }while (elemento!='(');
                         }
        }
                    if(!Pila.pilaVacia()) {

                        elemento = Pila.quitar();
                        postfija += elemento;
                    }
                System.out.println("La expresion a postfija es: \n"+postfija);
    }
}
