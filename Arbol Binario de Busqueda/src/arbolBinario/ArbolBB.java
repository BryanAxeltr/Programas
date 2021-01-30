package arbolBinario;

public class ArbolBB <T extends Comparable<T>> {
    Nodo<T> root;// El origen

    public Nodo<T> getRoot() {
        return root;
    }

    public boolean esRoot(Nodo<T> nodo) {
        return root == nodo;
    }

    public boolean esHoja(Nodo<T> nodo) {
        return nodo.getIzquierdo() == null && nodo.getDerecho() == null;
    }


    public Nodo<T> Add(Nodo<T> raiz, T elemento) {
        Nodo<T> nodo = null;
        if (root == null) {
            root = new Nodo<>(elemento);
        } else if (raiz == null) {
            System.out.println("El origen es nulo");
        } else {
            if (raiz.getElemento().compareTo(elemento) > 0) {
                if (raiz.getIzquierdo() != null) {
                    Add(raiz.getIzquierdo(), elemento);
                } else {
                    nodo = new Nodo<>(elemento);
                    nodo.setPadre(raiz);
                    raiz.setIzquierdo(nodo);
                }
            } else {
                if (raiz.getDerecho() != null) {
                    Add(raiz.getDerecho(), elemento);
                } else {
                    nodo = new Nodo<>(elemento);
                    nodo.setPadre(raiz);
                    raiz.setDerecho(nodo);
                }

            }
        }
        return nodo;
    }

    public void preorden(Nodo<T> nodo){
        System.out.println(nodo.getElemento().toString());
        if (nodo.getIzquierdo()!=null){
            preorden(nodo.getIzquierdo());
        }
        if (nodo.getDerecho()!=null){
            preorden(nodo.getDerecho());
        }
    }
    public void inorden(Nodo<T> nodo){

        if (nodo.getIzquierdo()!=null){
            inorden(nodo.getIzquierdo());
        }
        System.out.println(nodo.getElemento().toString());
        if (nodo.getDerecho()!=null){
            inorden(nodo.getDerecho());
        }
    }
    public void postorden(Nodo<T> nodo){

        if (nodo.getIzquierdo()!=null){
            postorden(nodo.getIzquierdo());
        }

        if (nodo.getDerecho()!=null){
            postorden(nodo.getDerecho());
        }
        System.out.println(nodo.getElemento().toString());
    }

    public void eliminar(Nodo<T> nodo,T dato){
    
    }


}