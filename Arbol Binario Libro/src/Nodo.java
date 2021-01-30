public class Nodo {
    protected Object dato;
    protected Nodo izquierdo;
    protected Nodo derecho;

    //Nodo raiz
    public Nodo(Object valor){
        dato=valor;
        izquierdo=null;
        derecho=null;
    }

    public Nodo(Nodo ramaizquierda, Object valor, Nodo ramaDerecho){
        this.dato=valor;
        izquierdo=ramaizquierda;
        derecho=ramaDerecho;
    }

    //Operaciones de acceso
    public  Object valorNodo(){
        return dato;
    }
    public Nodo subarvolIzquierdo(){
        return izquierdo;
    }
    public void nuevoValor(Object d){
        dato = d;
    }
    public void ramaIzdo(Nodo n){ izquierdo = n; }
    public void ramaDcho(Nodo n){
        derecho = n;
    }
}
