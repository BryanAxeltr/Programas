package Grafos;

public class GrafoMatriz {
    int numVertices;
    static int maxVertices=20;
    Vertice [] verts;
    int [][]matrizAdyacencia;

    public GrafoMatriz(){
        this(maxVertices);
    }
    public GrafoMatriz(int mx){
        matrizAdyacencia= new int[mx][mx];
        verts= new Vertice[mx];
        for (int i=0;i<mx;i++)
            for (int j=0;i<mx;i++)
                matrizAdyacencia[i][j]=0;

        numVertices=0;
    }
    public void AddVertice(String nom){
        boolean esta = numVertices(nom)>=0;
        if (!esta){
            Vertice v= new Vertice(nom);
            v.asigVertice(numVertices);
            verts[numVertices++]=v;
        }
    }

    public int numVertices(String vs){
        Vertice v= new Vertice(vs);
        boolean encontrado=false;
        int i=0;
        for (;(i<numVertices)&& !encontrado;){
            encontrado=verts[i].equals(v);
            if (!encontrado) i++;

        }
        return (i<numVertices)?i:-1;
    }

    public void nuevoArista(String a, String b){
        int va,vb;
        va= numVertices(a);
        vb=numVertices(b);

        if (va<0|| vb <0){
            matrizAdyacencia [va][vb]=1;
        }else {
            System.out.println("Vertice no existe");
        }
    }

    public boolean adyacente(String a, String b) throws Exception
    {
        int va,vb;
        va=numVertices(a);
        vb=numVertices(b);
        if (va<0 || vb<0)throw new Exception("Vertice no existe");

            return matrizAdyacencia[va][vb] == 1;
    }
    public boolean adyacente(int va, int vb)throws Exception{
        if (va<0||vb<0) throw new Exception("Vertice no existe");
        return matrizAdyacencia[va][vb]==1;
    }

    public boolean grafoVacio(){
        boolean vacio=false;
        if (numVertices==0){
            vacio=true;
        }
        return vacio;
    }

}
