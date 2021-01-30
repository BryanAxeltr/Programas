package ListaDobleEnlace;

public class Nodo {
    int dato;
    Nodo adelante;
    Nodo atras;

    public Nodo(int dato) {
        this.dato = dato;
        this.adelante = null;
        this.atras = null;
    }
}
