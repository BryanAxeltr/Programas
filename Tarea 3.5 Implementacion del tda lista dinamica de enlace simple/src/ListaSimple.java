public class ListaSimple {
    protected Nodo inicio,q;
    //constructor
    public ListaSimple() {
        inicio= null;
        q=null;
    }

    public void insertarInicio(int n){
        Nodo q= new Nodo(n,inicio);// se crea un nuevo nodo
        if (q==null){
            q=inicio;
        }
    }

    public void imprimeLista(){
        Nodo aux=inicio;
        while (aux!=null){
            System.out.print(aux.info+" ");
            aux=aux.liga;
        }
    }//fin del metodo imprimelista


}
