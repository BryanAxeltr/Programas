package PilaCola;

public class Cola {

    //propiedades
    final int MAX=100;
    private int queue[]=new int[MAX];
    private int frente,atras,nElementos;
    //Constructor
    public Cola()
    {atras=-1;frente=0;nElementos=0;}

    public boolean colaVacia()
    { return(nElementos==0); }

    public boolean colaLlena()
    {return (nElementos==MAX);}

    public void insertar(int x)
    {
        if(!colaLlena())
        {
            if(atras<MAX-1)
                ++atras;
            else
                atras=0;
            queue[atras]=x;
            ++nElementos;
        }
    }

    public int eliminar()
    {   int aux=-1;
        if(!colaVacia())
        {
            aux=queue[frente];
            --nElementos;
            if(frente<MAX-1)
                ++frente;
            else
                frente=0;
        }
        return aux;
    }
}
