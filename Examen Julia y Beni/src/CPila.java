public class CPila {
    //propiedades
        final int MAX=10;
        
        private int tope;
        private int N[]=new int[MAX];
        //constructor
        public CPila(){
            tope=-1;
        }
        
        //Llenar la pila
        public boolean pilaLlena()
        { return (tope==MAX-1);    }
        //Pila vacia
        public boolean pilaVacia()
        { return (tope==-1);}
        //Insertar
        public void insertar(int x)
        {
            if(!pilaLlena())
            {
                ++tope;
                N[tope]=x;
            }
        }
        //Eliminar un valor de la pila
        public int eliminar()
        {   int valor=-1;
            if(!pilaVacia())
            {
                valor=N[tope];
                --tope;
                return valor;
            }
            return valor;
        }

        public String toString(){
            String c="";
            if(!pilaVacia())
            {
                for(int i=0;i<=tope;i++)
                    c=c+N[i]+"\n";
                return c;
            }
            else
                return "Pila Vacia";
        }
}
