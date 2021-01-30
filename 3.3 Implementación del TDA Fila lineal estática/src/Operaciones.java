public class Operaciones {

    private int frente;
    private int atras;
    private int fila[ ];
    private int dato;
    private int contador;
    private int max,n;
    //Constructor
    public void Operaciones(int n){
        max=n;
        frente=-1;
        atras=-1;
        fila= new int[max];
    }

    //Metodo Insertar
    public void insertar(int x) {
        if(!filaLlena()){
            atras++;
            fila[atras]=x;
            if (atras==0){
                frente=0;
            }
        }
        else {
            System.out.println("Error Desbordamiento");
        }

//Hernande Gama Bryan Axel

    }
        //Quita los elementos de la fila
        public int quitar(){
             if(!filaVacia()){
                 dato=fila[frente];
                 if(frente==atras){
                     frente=-1;
                     atras=-1;
                 }else {
                     frente+=1;
                 }

             }
             else {
                 System.out.println("Subdesbordamiento");
             }
             return dato;
        }

        //Vacia la cola
        public void VaciarCola(){
            frente=0;
            atras=-1;
        }
        //fila vacia
        public boolean filaVacia(){
        if(frente==-1 && atras==-1){
            return true;
        }
        else{
            return false;
        }
        }
        //Fila llena
        public boolean filaLlena(){
        if (atras==max-1){
            return true;
        }
        else {
            return false;
        }
        }
        //Info
        public int info(){
        dato=-1;
        if (filaVacia()){
            System.out.println("No hay datos");
        }
        dato=fila[frente];
            return dato;

        }

        public void vaciarFila(){
        if (!filaVacia()){
            frente=-1;
            atras=-1;
        }
        }

        public boolean buscar(int n){
        boolean ver=false;
        for (int i=0;i<fila.length;i++){
               if (n==fila[i]) {
                   ver = true;
               }
        }
        return ver;
        }
        public void mostrarFila(){
        int i=frente;
            while (i<fila.length){
                if (!filaVacia()){
                    if (fila[i]!=0)
                    System.out.println(fila[i]);
                }
                i++;
            }
        }
        public int contador(){
        contador=atras-frente+1;
        return contador;
        }

}
//Hernandez Gama Bryan Axel