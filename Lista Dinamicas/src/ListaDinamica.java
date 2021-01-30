public class ListaDinamica<T> {
    //Atributos
    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int size;

    public ListaDinamica(){
        primero= null;
        ultimo=null;
        size=0;

    }

    public boolean info(){
        return size==0;
    }

    public int size(){
        return size;
    }

    private Nodo<T> getNode(int index){
        if (info() || (index<0 || index>= size())){
            return null;
        }else if (index==0){
            return primero;
        }else if (index==size()-1){
            return ultimo;
        }else {

            Nodo<T> buscado=primero;

            int contador =0;

            while (contador<index){
                contador++;
                buscado= buscado.getSiguiente();
            }
            return buscado;

        }
    }

    public T get( int index){
        if (info() || (index<0 || index>= size())){
            return null;
        }else if (index==0){
            return primero.getElemento();
        }else if (index==size()-1){
            return ultimo.getElemento();
        }
        else{
            Nodo<T> buscado=getNode(index);
            return buscado.getElemento();
        }

    }

    public T getprimero(){
        if (info()){
            return null;
        }
        else
        {
            return primero.getElemento();
        }
    }
    public T getultimo(){
        if (info()){
            return null;
        }
        else
        {
            return ultimo.getElemento();
        }
    }

    public T addprimero(T elemento){
        Nodo<T> aux;

        if(info()){
            aux= new Nodo<>(elemento,null);
            primero= aux;
            ultimo=aux;
        }
        else{
            aux= new Nodo<>(elemento,primero);
            primero=aux;
        }
        size++;
        return primero.getElemento();
    }

    public T addfinal(T elemento){
        Nodo<T> aux;

        if(info()){
            addprimero(elemento);
        }
        else{
            aux= new Nodo<>(elemento,primero);
            ultimo.setSiguiente(aux);
            ultimo=aux;
        }
        size++;
        return primero.getElemento();
    }

    public T add(T elemento, int index){
        if (index==0){
        return addprimero(elemento);}
        else if(index==size()){
            return addfinal(elemento);
        }else if (index<0 || index>=size()){
            return null;
        }
        else {
            Nodo<T> anterior= getNode(index-1);
            Nodo<T> actual=getNode(index);
            Nodo<T> aux= new Nodo<>(elemento,actual);
            anterior.setSiguiente(aux);
            size++;

            return getNode(index).getElemento();
        }
    }
    public String toString(){
        String cadena="";

        if (info()){
            cadena= "Lista vacia";
        }else {
            Nodo<T> aux=primero;
            while(aux!=null){
                cadena+=aux.toString();
                aux=aux.getSiguiente();
            }
        }
        return cadena;
    }
    }


