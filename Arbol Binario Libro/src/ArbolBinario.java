public class ArbolBinario {
    protected Nodo raiz;
    public ArbolBinario(){
        raiz=null;
    }
    public ArbolBinario(Nodo raiz){
        this.raiz=raiz;
    }
    public Nodo raizArbol(){
        return raiz;
    }

    //Comprueba el estatus del arbol

    boolean esVacio(){
        return raiz== null;
    }

    //Creaccion un rabol de raiz 
    public static Nodo nuevoArbol(Nodo ramaIzquierda, Object dato, Nodo ramaDerecha){
        return new Nodo(ramaIzquierda,dato, ramaDerecha);
    }
}
