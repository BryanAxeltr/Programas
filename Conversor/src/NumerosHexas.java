

public class NumerosHexas {
    public static void main(String[] args) {

        long tama=100L;

        for(long i=0L,decimal=0;i<=tama;i++,decimal++){
            String hexadecimal = Long.toHexString(i);
            System.out.println( hexadecimal.toUpperCase());
        }


    }

}