public class Examen_Jasson {
    public static void  main(String[] args) {
        String ExpresionA = "100!4!/5!20!*+50!3!*-";
        int Expresion1,Expresion2,operacion;
        String Temporal="";
        CPila cPila= new CPila();

        for (int i=0;i<ExpresionA.length();i++){
                //Convierte de string a int
            if (Character.isDigit(ExpresionA.charAt(i))){
                Temporal+=ExpresionA.charAt(i);}
            else {
                if (ExpresionA.charAt(i) == '!') {
                    cPila.insertar(Integer.parseInt(Temporal));
                    Temporal = "";

                }
                else if (ExpresionA.charAt(i) == '+') {
                    Expresion1 = cPila.eliminar();
                    Expresion2 = cPila.eliminar();
                    operacion = Expresion2 + Expresion1;
                    cPila.insertar(operacion);
                }
                else if (ExpresionA.charAt(i) == '-') {
                    Expresion1 = cPila.eliminar();
                    Expresion2 = cPila.eliminar();
                    operacion = Expresion2 - Expresion1;
                    cPila.insertar(operacion);

                }
                else if (ExpresionA.charAt(i) == '*') {
                    Expresion1 = cPila.eliminar();
                    Expresion2 = cPila.eliminar();
                    operacion = Expresion2 * Expresion1;
                    cPila.insertar(operacion);

                }
                else if (ExpresionA.charAt(i) == '/') {
                    Expresion1 = cPila.eliminar();
                    Expresion2 = cPila.eliminar();
                    operacion = Expresion2 / Expresion1;
                    cPila.insertar(operacion);
                }else{
                    System.out.println("Expresion no encontrada");
                }
            }


        }
        System.out.println("Expresion en notacion Infija= 100/4+5*20-50-3 =");
        System.out.println("Analizandola en Notación Posfija: " + ExpresionA);
        System.out.println("El resultado es: " + cPila.eliminar());
    }
}
