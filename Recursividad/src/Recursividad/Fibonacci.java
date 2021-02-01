package Recursividad;
//Sumar los numeros naturales hasta N de forma recursiva
public class Fibonacci {
    public int sumaRecursiva(int n){
        int res;
        if (n==1){
            return 1;
        }else {
            res=n+sumaRecursiva(n-1);
        }
        return res;
    }
}
