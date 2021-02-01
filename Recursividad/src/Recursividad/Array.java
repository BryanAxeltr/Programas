package Recursividad;
//Recorrer un array de forma recursiva
public class Array {
private int arreglo[]={1,2,3,4,5,6,9};

public void mostrarArray(int indice){

    if (indice!=arreglo.length){
        System.out.print(arreglo[indice]+" ");
        mostrarArray(indice+1);

    }

}


}
