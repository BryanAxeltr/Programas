public class InfijaPostfija {

    private int max;
    private int cima;
    private char Sizepila[];
    private Object op;
    private Object op2;
    private boolean comparador=false;

    public InfijaPostfija(int max) {
        int n=max;
        cima = -1;
        Sizepila = new char [n];
    }
    public char insertar(char d) {
        cima++;
        return Sizepila[cima]= d;
    }

    public char quitar() {
        return Sizepila[cima--] ;
    }
    public boolean pilaLlena(){
        return cima==max-1;
    }

    public boolean pilaVacia(){
        return cima== -1;
    }
    //Checa si es alguno de los operadores q
    public boolean Basico(char op){
        boolean r=false;
        if(op=='+') r=true;
        if(op=='-') r=true;
        if(op=='*') r=true;
        if(op=='/') r=true;
        if(op=='^') r=true;
        return r;
    }
    //Verifica si es un operador
    public boolean esOperador(char op){
        boolean r =Basico(op);
        switch (op){
            case '(':
            case ')': r=true;break;
        }
        return r;
    }
    public int cimaop(char op){
        switch (op) {
            case '^' -> op = 3;
            case '*' -> op = 2;
            case '/' -> op = 2;
            case '+' -> op = 1;
            case '-' -> op = 1;
            case '(' -> op = 0;
        }
        return op;

    }
    public int cimaop2(char op2){
        switch (op2) {
            case '^' -> op2 = 3;
            case '*' -> op2 = 2;
            case '/' -> op2 = 2;
            case '+' -> op2 = 1;
            case '-' -> op2 = 1;
            case '(' -> op2 = 0;
        }
        return op2;
    }
    //Compara si son iguales
    //Compara los caracteres	cima y simbolo
    public boolean esmenor(char op, char op2){
        int nc=cimaop(op);
        int ns=cimaop2(op2);
        //Simbolo cima
        if(ns<=nc) comparador=true;
        return comparador;
    }
    public boolean esmayor(char op, char op2){
        int nc=cimaop(op);
        int ns=cimaop2(op2);
        if (ns>nc) comparador=true;
        return comparador;
    }
    public char Cima(){
    if(pilaVacia()){
        System.out.println("No hay datos");
    }
        return Sizepila[cima];
    }
}
