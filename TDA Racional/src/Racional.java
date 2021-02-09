public class Racional {
     private int num;
     private int den;
    
     public Racional(int n, int d){
         num=n;
         den=d;
     }

     public void establecerNum(int n){
         num=n;
     }

     public void establecerDen(int d){
         den=d;
     }

     public void copy(Racional r){
         num=r.obtenerNum();
         den=r.obtenerDen();
     }

     public int obtenerNum(){
         return num;
     }

     public int obtenerDen(){
         return den;
     }

     public boolean equals(Racional r){
         int rnum= r.obtenerNum();
         int rden= r.obtenerDen();
         int rmcd= mcd(rnum,rden);
         int MCD= mcd(num,den);
         return num/MCD==rnum/rmcd&& den/MCD == rden/rmcd;
     }

     private int mcd(int a, int b){
         int r;
         while (a%b!=0) {
             r=a%b;
             a=b;
             b=r;
         }
         return b;
     }

     public String toString(){
         return (num+"/"+den);
     }
     public Racional clone(){
         Racional r= new Racional(num,den);
         return r;
     }

     public Racional suma( Racional op ) {
        int n = num*op.obtenerDen() + den*op.obtenerNum();
        int d = den * op.obtenerDen();
        return( new Racional(n, d ) );
         }


        public Racional resta( Racional op ) {
        int n = num*op.obtenerDen()
         - den*op.obtenerNum();
        int d = den * op.obtenerDen();
         Racional s = new Racional(n,d);
        return s;
         }

        public Racional producto( Racional op ) {
            return
             new Racional(num*op.obtenerNum(),
             den*op.obtenerDen());
             }

        public Racional cociente( Racional op){
            return
             new Racional (num*op.obtenerDen(),
            den*op.obtenerNum());
            }
            
        


    
}
