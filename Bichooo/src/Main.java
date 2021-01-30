

public class Main{

    private static Fraccion suma;
    private static Fraccion resta;

    public static void main(String[] args) {
        // Se crean 4 fracciones
        Fraccion f1 = new Fraccion(1, 4); // Fracción 1/4
        Fraccion f2 = new Fraccion(1, 2); // Fracción 1/2
        // operaciones aritméticas con esas fracciones
        Fraccion suma = f1.sumar(f2);
        Fraccion resta = f1.restar(f2);
        //mostrar resultados
        System.out.println(f1 + " + " + f2 + " = " + suma);
        System.out.println(f1 + " - " + f2 + " = " + resta);
    }

}