//Nathália Dutra de Oliveira - 21478253

public class FilaDinamica {
    private Stack pilhaPrincipal;
    private Stack pilhaAuxiliar;
    private int tamanho;

    //Construtor da classe, criando as duas pilhas e inicializando o tamanho da fila em 0
    public FilaDinamica(){
        pilhaPrincipal = new Stack();
        pilhaAuxiliar = new Stack();
        tamanho = 0;
    }


    //Verificação se a fila está vazia, usando o valor retornado no método "Tamanho"
	public boolean isEmpty() {
		if(this.tamanho() == 0)
			return true;
		else 
			return false;
	}
	
    //Inserção do elemento na pilha principal
	public void entra(int elem) {
        this.pilhaPrincipal.push(elem);
        tamanho++;
	}
	
    //Remoção do elemento da pilha auxiliar
	public int sai() {
        /*Criando uma verificação se a pilha auxiliar (pilha onde será feita a remoção), está vazia. Enquanto ela estiver vazia, 
        irá receber os valores da pilha principal, na ordem invertida que foi feita a inserção na pilha principal*/
        if(pilhaAuxiliar.isEmpty()){
            while (!pilhaPrincipal.isEmpty()) {
                pilhaAuxiliar.push(pilhaPrincipal.pop());
            }
        }

        //declarando uma variavel auxiliar para receber os valores da pilha auxiliar e posteriormente, retornar estes valores.
        int auxiliar = 0;

        /*verificação para saber se a pilha auxiliar não está vazia. Caso não estiver vazia, será feita remoção dos valores para passar
        para a variavel auxiliar, que irá retornar os valores no final do método*/
        
        if (!pilhaAuxiliar.isEmpty()) {
            auxiliar = pilhaAuxiliar.pop();
            tamanho--;
        }

        return auxiliar;
	}

    public int tamanho() {
		return tamanho;
    }
    
}
