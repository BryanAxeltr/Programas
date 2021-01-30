package ListaDobleEnlace;
//BRYAN AXEL HERNANDEZ GAMA
//INGENIERIA SISTEMAS COMPUTACIONALES
//LISTA DOBLE ENLACE
public class ListaDoble {
    Nodo cabeza;
    Nodo ultimo;
//B
   public ListaDoble insertaralFrente(int dato){
       Nodo nuevo= new Nodo(dato);
       nuevo.adelante=cabeza;//Apunta a la cabeza
       if (cabeza!=null)
           cabeza.atras=nuevo;
           cabeza=nuevo;
           return this;
   }
    //R
    public ListaDoble insertaralFinal(int dato){
        Nodo actual;
        actual=cabeza;
        while (actual.adelante!=null){
                actual=actual.adelante;
        }
        if (actual.adelante==null){
            insertarDespues(actual,dato);
        }
       return this;
    }
    //Y
    public ListaDoble referencia(int referencia,int dato){
       Nodo actual;
       actual=cabeza;
        while (actual.dato!=referencia){
            actual=actual.adelante;
        }
        insertarDespues(actual,dato);
       return this;
    }
    //A
    public ListaDoble busqueda(int referencia){
        Nodo actual;
        actual=cabeza;
        boolean encontrado=false;
        while (actual.dato!=referencia && actual.adelante!=null){
            actual=actual.adelante;
        }
        if (actual.dato==referencia) {
            System.out.println("El dato se encuentra en la lista");
        }else
        System.out.println("El dato no se encuentra en la lista ");
       return this;

    }
    //N
   public ListaDoble insertarDespues(Nodo anterior, int dato){
       Nodo nuevo;
       nuevo=new Nodo(dato);
       nuevo.adelante=anterior.adelante;
       if (anterior.adelante!=null)
       anterior.adelante.atras=nuevo;
       anterior.adelante=nuevo;
       nuevo.atras= anterior;
       return this;
   }
   public void eliminar(int dato){
       Nodo actual;
       boolean encontrado= false;
       actual=cabeza;

       //Bucle de busqueda
       while (actual!=null && !encontrado){
           encontrado=(actual.dato==dato);
           if (!encontrado)
               actual=actual.adelante;
       }


       //Enlace de nodo anterior con el siguiente
       if (actual!=null){
           //Distingue entre nodo cabecera o resto de la lista
           if (actual==cabeza){
               cabeza=actual.adelante;
               if (actual.adelante!=null)
                   actual.adelante.atras=null;
           }
           else if (actual.adelante!=null){
               actual.atras.adelante=actual.adelante;
               actual.adelante.atras=actual.atras;
           }else
               actual.atras.adelante=null;
               actual=null;
       }
   }
   public void VisualizarIF(){
       Nodo actual=cabeza;
       while (actual!=null){
           System.out.print(actual.dato+" ");
               actual=actual.adelante;
       }
       System.out.println(" ");
   }
    public void VisualizarFI(){

        Nodo actual;
        actual=cabeza;
        while (actual.adelante!=null){
            actual=actual.adelante;
        }
        if (actual.adelante==null) {
            while (actual != null) {
                System.out.print(actual.dato + " ");
                actual = actual.atras;
            }
        }
        System.out.println(" ");


    }

}
