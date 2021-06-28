//Nathália Dutra de Oliveira - 21478253

public class Stack {
    private No topo;
	
//	Construtor
	public Stack() {
		this.topo = null;
	}

//	Est� vazio?
	public boolean isEmpty() {
		if(this.topo == null)
			return true;
		else 
			return false;
	}
	
//	Inserir
	public void push(int elementos) {
		No novoNo = new No(elementos);
		
		No aux = topo; //Posi��o de mem�ria atual de topo
		
		novoNo.prox = aux; //novoNo.prox recebe posi��o de mem�ria atual de topo
		
		this.topo = novoNo; //topo aponta para o novoNo
	}
	
//	Remo��o
	public int pop() {
		if(this.isEmpty()) {
			System.out.println("Pilha vazia");
			return -1;
		}
		
		No aux = topo; //Posi��o atual de topo
		topo = topo.prox; //Pego pr�ximo da pilha e coloco em topo

		return aux.dado;
	}
    
}
