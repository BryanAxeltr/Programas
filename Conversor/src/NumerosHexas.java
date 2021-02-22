public class NumerosHexas {
    public static void main(String[] args) {

        long tama=9999999999L;
        for(long i=0L,decimal=0;i<=tama;i++,decimal++){
            String hexadecimal = Long.toHexString(i);
            System.out.println( hexadecimal);
        }


    }

    public static String decimalAHexadecimal(long decimal) {
        String hexadecimal = "";
        String caracteresHexadecimales = "0123456789abcdef";
        while (decimal > 0) {
            long residuo = decimal % 16;
            hexadecimal = caracteresHexadecimales.charAt(Math.toIntExact(residuo)) + hexadecimal; // Agregar a la izquierda
            decimal /= 16;
        }
        return hexadecimal;
    }
}