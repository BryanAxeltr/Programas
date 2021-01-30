public class Nodo{
    public int info;
    public Nodo liga;


    public Nodo(int dato){
        info= dato;
    }

    public Nodo(int dato, Nodo enlace) {
        info=dato;
        liga=enlace;
    }



}
