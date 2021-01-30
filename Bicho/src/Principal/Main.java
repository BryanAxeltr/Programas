package Principal;

public class Main {

    public static void main(String[] args) {
        Ave a= new Ave();
        Avestruz ave= new Avestruz();
        Pato pato= new Pato();
        a.vuela();
        a=ave;
        ave.vuela();
        a.vuela();
        a=pato;
        a.vuela();
        pato.vuela();
    }
}
