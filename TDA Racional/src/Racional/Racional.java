package Racional;
public class Racional {
    private int num1, den1, num2, den2;

    public Racional()
    {
        num1=0;
        den1=1;

        num2=0;
        den2=1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getDen1() {
        return den1;
    }

    public void setDen1(int den1) {
        this.den1 = den1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getDen2() {
        return den2;
    }

    public void setDen2(int den2) {
        this.den2 = den2;
    }

    public String sumaRacional(int numerador, int denominador, int numerador2, int denominador2){

        num1=(num1*den2+num2*den1);
        den1=(den1*den2);
        return toString(num1,den1);
    }
    public String divisionRacional(int numerador, int denominador, int numerador2, int denominador2){
        setNum1(numerador);
        setDen1(denominador);
        setDen2(denominador2);
        setNum2(numerador2);
        num1=(getNum1()*getDen2());
        den1=(getNum2()*getDen1());
        return toString(num1,den1);
    }

    public String restaRacional(int numerador, int denominador, int numerador2, int denominador2){
        setNum1(numerador);
        setDen1(denominador);
        setDen2(denominador2);
        setNum2(numerador2);
        num1=(getNum1()*getDen2()-getNum2()*getDen1());
        den1=(getDen1()*getDen2());
        return toString(num1,den1);
    }
    public String mulRacional(int numerador, int denominador, int numerador2, int denominador2){
        setNum1(numerador);
        setDen1(denominador);
        setDen2(denominador2);
        setNum2(numerador2);
        num1=(getNum1()*getNum2());
        den1=(getDen1()*getDen2());
        return toString(num1,den1);
    }


    public String toString(int num1,int den1) {
        return "Resultado de la operacion: "+num1+"/"+den1;
    }
}

