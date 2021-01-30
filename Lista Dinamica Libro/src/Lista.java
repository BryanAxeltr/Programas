public class Lista {
    private Nodo primero;
    public Lista(){
        primero=null;
    }

    public Lista insertarInicio(int entrada){
        Nodo nuevo;
        nuevo= new Nodo(entrada);
        nuevo.enlace=primero;       //enlaza nuevo nodo al frente de la lista
        primero=nuevo;              //mueve primero y apunta al nuevo nodo
        return this;                //devuelve referencia del objeto lista

    }

    public Lista insetarultimo(Nodo ultimo, int entrada){
        ultimo.enlace= new Nodo(entrada); //Crea un nodo, inicializando su dato a entrada
        ultimo=ultimo.enlace;
        return this;

    }
    public Lista insertarAntesDespues(Nodo anterior, int entrada){
        Nodo nuevo= new Nodo(entrada); //Se creo el nuevo nodo con el dato dato que introdujimos
        nuevo.enlace=anterior.enlace;
        anterior.enlace=nuevo;
        return this;
    }

    public Lista insertarlista(int testigo, int entrada){
        Nodo nuevo, anterior;
        anterior=buscarLista(testigo);
        if (anterior!=null){
            nuevo= new Nodo(entrada);
            nuevo.enlace=anterior.enlace;
            anterior.enlace=nuevo;
        }
        return this;
    }
    public Nodo buscarLista(int destino){
        Nodo indice;
        for(indice=primero;indice!=null;indice=indice.enlace) {
            if (destino == indice.dato){// (destino.equals(indice,dato))
                return indice;
        }
        }
        return null;
    }
    public Nodo buscarPosicion(int posicion){
        Nodo indice;
        int i;
        if (posicion<0){
            return null;

        }
        indice=primero;
        for (i=1;i<posicion && indice!=null;i++){
            indice=indice.enlace;
        }
        return indice;
    }
    public void eleiminarNodo(int entrada){
        Nodo actual,anterior;
        boolean encontrado;
        //Inicializa los apuntadores
        actual= primero;
        anterior=null;
        encontrado=false;

        //busqueda del nodo y el anterior
        while (actual!=null && !encontrado){
            encontrado=(actual.dato==entrada);
            //con objetos: actual.dato.equals(entrada)
            if(!encontrado){
                anterior=actual;
                actual=actual.enlace;
            }
        }
        //Enlace del nodo anterior con el siguiente
            if (actual!=null){
                //Distingue entre que el nodo sea el cabecera, o del resto del lista
                if (actual == primero){
                    primero=actual.enlace;

                }
                else {
                    anterior.enlace=actual.enlace;

                }
                actual=null; //no es necesario al ser una variable local
            }
    }

    public void verlista(){
        Nodo n;
        int k=0;
        n=primero;
        while(n!=null){
            System.out.println(n.dato+" ");
            n=n.enlace;
            k++;
            System.out.println(n);
        }
    }




}
