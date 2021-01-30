package Pila;

public class ClasePila {
	
	int tope;
	int max;
	private int[]elem;
	
	public void Pila(int n) {
		this.max=n;
		elem= new int [max];
		tope=-1;
		
	}
	
	//Metodo Pilavacia
	public boolean Pilavacia() {
	if(tope==-1) {
		return true;
		
	}
	else {
		return false;
	}
	}
	
	//Metodo Pilallena
	public boolean Pilallena() {
		if(tope== max-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Apilar dato o push
	
	public void push(int dato) {
		if(Pilallena()) {
			System.out.println("Desbordamiento");
		}
		
		else
		{
			tope++;
			
			elem[tope]=dato;
		}
	}
	
	//desapilar o pop
	public void pop() {
		int dato;
		if(Pilavacia()) {
			System.out.println("Subdesbordamiento");
		}
		else {

			dato=elem[tope];
			tope=tope-1;
		}
	}

	//Metodo info
	
	public void info() {
		int dato; 
		if(Pilavacia()) {
			System.out.println("Error no hay datos");
		}
		
		else {
			dato=elem[tope];
		}
	}
}
