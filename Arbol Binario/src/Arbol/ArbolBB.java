package Arbol;

public class ArbolBB {
    protected Nodo nodo;


    public Nodo getnodo(){
        return nodo;
    }
    public Nodo infonodo(){
        return nodo;
    }

    public void inserccion(Nodo origen, int infor){
        if(origen!=null){
            if (infor<origen.dato){
                inserccion(origen.izq, infor);
            }
            else {
                if (infor> origen.dato){
                    inserccion(origen.der,infor);
                }
                else {
                    System.out.println("El nodo ya se encuentra en el arbol ");
                }
            }
        }
        else {
            Nodo otro= new Nodo();
            otro.izq=null;
            otro.der=null;
            otro.dato=infor;
            this.nodo=otro;
            System.out.println("Creo uno nuevo");
        }
    }

    public void preorden(Nodo nodo){
        if (nodo!= null){
            System.out.println(nodo.dato);
            preorden(nodo.izq);
            preorden(nodo.der);
        }

    }
    public void postorden(Nodo nodo){
        if (nodo!=null) {
            postorden(nodo.izq);
            postorden(nodo.der);
            System.out.println(nodo.dato);
        }
    }
    public void inorden(Nodo nodo){
        if (nodo!=null){
            inorden(nodo.izq);
            System.out.println(nodo.dato);
            inorden(nodo.der);
        }

    }


    public void eliminacion(Nodo nodo, int dato){
        if (nodo!= null){
            if (dato<nodo.dato){
                eliminacion(nodo.izq, dato);
            }else {
                if (dato>nodo.dato){
                    eliminacion(nodo.der, dato);
                }
                else {
                    Nodo otro= new Nodo();
                    otro=nodo;
                    if (otro.der==null){
                        nodo= otro.izq;
                    }else {
                        if (otro.izq==null){
                            nodo=otro.der;
                        }else {
                            Nodo aux= new Nodo();
                            Nodo aux1= new Nodo();
                            aux=otro.izq;
                            aux1=aux;
                            while (aux.der!=null){
                                aux1= aux;
                                aux= aux.der;
                            }
                            otro.dato=aux.dato;
                            otro=aux;
                            aux1.der=aux.izq;
                        }
                    }
                }
            }
        }
        else {
            System.out.println("El nodo no se encuentra en el arbol");
        }
    }

    public void busqueda(Nodo nodo, int dato){
        if (nodo!=null){
            if (dato<nodo.dato){
                if (nodo.izq==null){
                    System.out.println("El nodo no se encuentra en el arbol");
                }
                else {
                    busqueda(nodo.izq,dato);
                }
            }else {
                if (dato>nodo.dato){
                    if (nodo.der==null){
                        System.out.println("No se encuentra en el arbol");
                    }else {
                        busqueda(nodo.der, dato);
                    }
                }else {
                    System.out.println("El nodo se encuentra en el arbol");
                }
            }
        }else {
            System.out.println("Arbol vacio");
        }
    }



}

