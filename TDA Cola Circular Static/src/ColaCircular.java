//Bryan Axel Hernandez Gama
//Carrera Sistemas Computacionales

public class ColaCircular {
    private static final int max=99;
    protected int frente;
    protected int fin;
    protected Object[] listaCola;
    int contador=0;

    //Avanza una posicion

    private int siguiente(int r){
        return (r+1) %max;
    }

    //Inicializa la cola vacia

    public ColaCircular(){
        frente=-1;
        fin=-1;
        listaCola= new Object[max];

    }
    //Operaciones

    public void insertar(Object elemento){
        if(!colaLlena()){
            fin= siguiente(fin);
            listaCola[fin]=elemento;
            contador(1);
        }else {
            System.out.println("Desbordamiento en la cola");
        }
    }
//Bryan Axel Hernandez Gama
//Carrera Sistemas Computacionales

    public Object quitar(){
        if (!colaVacia()){
            Object tm=listaCola[frente];
            frente= siguiente(frente);
            contador(2);
            return tm;
        }else {
            return "Cola vacia";
        }
    }
    public void borraCola(){
        frente=0;
        fin=max-1;

    }
    //acceso a la cola

    public Object frenteCola(){
        if (!colaVacia()){
            return listaCola[frente];
        }else {
           return "cola vacia";
        }
    }
    //Metodos de verificacion del estado de la cola

    public boolean colaVacia(){
        return frente==siguiente(fin);
    }
    public boolean colaLlena(){
        return frente==siguiente(siguiente(fin));
    }
    public void contador(int c){
        if (c==1){
            contador++;
        }
        else if (c==2){
            contador--;
        }
        else {
            System.out.println("El numero de datos son :"+contador);
        }
    }
    public Boolean buscarcola(Object busqueda){
        for (int i=0;i<listaCola.length;i++){
            if (listaCola[siguiente(i)]==busqueda){
             return true;
            }
        }
        return false;
    }


    public void imprimirCola(){
        int i;
        for (i=-1;i<contador;i++){
            if (listaCola[siguiente(i)]!=null)
                System.out.print(listaCola[siguiente(i)]+" ");
        }
        System.out.println(" ");
    }

}
