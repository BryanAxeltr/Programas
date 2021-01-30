package Grafos;

public class Vertice {
    String nombre;
    int numVertice;
    public Vertice(String x){
        nombre=x;
        numVertice=-1;
    }

    public String nomVertice(){//Devuelve identificador del vertice
        return nombre;
    }

    public boolean equals(Vertice n){// True, si dos vertices son iguales
        return nombre.equals(n.nombre);
    }
    public void asigVertice(int n){//Establece el numero de vertices
        numVertice=n;
    }
    public String toString(){
        return nombre + "("+numVertice+")";
    }



}
