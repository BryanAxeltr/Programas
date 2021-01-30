package PilaCola;

public class Pila {
        public static final int Tampila=79;
        public int cima;
        public Object[] listaPila;

        public void insertar(Object elemento){
            if(pilaLlena()){
                System.out.println("Desbordamiento pila");
            }
            cima++;
            listaPila[cima]=elemento;
        }

        public Object quitar(){
            Object aux;
            if(pilaVacia()){	//Si la pila esta vacia
                System.out.println("PilaCola.Pila Vacia, no se puede extraer");
            }
            aux=listaPila[cima]; //Toma el valor que esta hasta arriba
            cima--;					//Elimina el valor que tomo
            return aux;
        }
        public Object cimaPila(){
            if(pilaVacia()){
                System.out.println("PilaCola.Pila vacia, no se puede extraer");
            }

            return listaPila[cima];
        }

        public boolean pilaVacia(){
            return cima== -1;
        }

        public boolean pilaLlena(){
            return cima== Tampila-1;
        }

        public void limpiarPila(){
            cima= -1;
        }


    }

