public class ExamenJulia {
    //
    public static void  main(String[] args) {
        //   expresion 1 y expresion 2
        int exp1,exp2;
        //Objeto
        CPila clasePila= new CPila();
        int incremento=0,resultado;
        //Texto
        String almacenamiento="";
        String Texto = "100!4!/5!20!*+50!3!*-";
        while (incremento<Texto.length()){
                //Cambia el valor de texto a numerico
            if (Character.isDigit(Texto.charAt(incremento))){
                almacenamiento+=Texto.charAt(incremento);}
            else {
                //Si el caracter se parece a algunos de estas condicionales hace la operacion
                if (Texto.charAt(incremento) == '!') {
                    clasePila.insertar(Integer.parseInt(almacenamiento));
                    almacenamiento = "";

                } else if (Texto.charAt(incremento) == '+') {
                    exp1 = clasePila.eliminar();
                    exp2 = clasePila.eliminar();
                    resultado = exp2 + exp1;
                    clasePila.insertar(resultado);
                } else if (Texto.charAt(incremento) == '-') {
                    exp1 = clasePila.eliminar();
                    exp2 = clasePila.eliminar();
                    resultado = exp2 - exp1;
                    clasePila.insertar(resultado);

                } else if (Texto.charAt(incremento) == '*') {
                    exp1 = clasePila.eliminar();
                    exp2 = clasePila.eliminar();
                    resultado = exp2 * exp1;
                    clasePila.insertar(resultado);

                } else if (Texto.charAt(incremento) == '/') {
                    exp1 = clasePila.eliminar();
                    exp2 = clasePila.eliminar();
                    resultado = exp2 / exp1;
                    clasePila.insertar(resultado);
                } else {
                    System.out.println("Expresion no soportada");
                }
            }
            incremento++;
        }
        System.out.println("Expresion en notacion Infija: 100/4+5*20-50-3");
        System.out.println("Analizandola en Notación Posfija: " + Texto);
        System.out.println("Examen Julia El resultado es: " + clasePila.eliminar());
    }
}
