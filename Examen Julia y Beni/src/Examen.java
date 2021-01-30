public class Examen{
    //David benites
    public static void  main(String[] args) {
        String cadena = "100!4!/5!20!*+50!3!*-";
        int numero1,numero2,resultado,i=0;
        String expresion="";
        CPila pila= new CPila();

        while (i<cadena.length()){

            if (Character.isDigit(cadena.charAt(i))){
            expresion+=cadena.charAt(i);}
            else {
                if (cadena.charAt(i) == '!') {
                    pila.insertar(Integer.parseInt(expresion));
                    expresion = "";

                }
                else if (cadena.charAt(i) == '+') {
                    numero1 = pila.eliminar();
                    numero2 = pila.eliminar();
                    resultado = numero2 + numero1;
                    pila.insertar(resultado);
                }
                else if (cadena.charAt(i) == '-') {
                    numero1 = pila.eliminar();
                    numero2 = pila.eliminar();
                    resultado = numero2 - numero1;
                    pila.insertar(resultado);

                }
                else if (cadena.charAt(i) == '*') {
                    numero1 = pila.eliminar();
                    numero2 = pila.eliminar();
                    resultado = numero2 * numero1;
                    pila.insertar(resultado);

                }
                else if (cadena.charAt(i) == '/') {
                    numero1 = pila.eliminar();
                    numero2 = pila.eliminar();
                    resultado = numero2 / numero1;
                    pila.insertar(resultado);
                }
            }

i++;
        }
        System.out.println("Expresion en notacion Infija= 100/4+5*20-50-3 =");
        System.out.println("Analizandola en Notación Posfija: " + cadena);
        System.out.println("El resultado es: " + pila.eliminar());
    }
}