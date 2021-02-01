package Recursividad;

public class Factorial {
    public int factorial(int n){
        int resultado;

        if (n==1){
            return 1;

        }else {
            resultado= n*factorial(n-1);
        }
        return resultado;
    }
}
