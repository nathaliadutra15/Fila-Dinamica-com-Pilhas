# Implementando uma Fila Dinâmica - Estrutura de Dados

Aplicando os conceitos de uma Fila Dinâmica em Java a partir de duas Pilhas Estáticas.

Este projeto faz parte uma atividade dada na matéria Estrutura de Dados com os seguintes requisitos:

1.	Objetivo: Criar uma fila a partir de duas pilhas

* Nesse exercício, você implementará uma Fila Dinâmica utilizando duas Pilhas Dinâmicas. A classe da FilaDinamica possui como atributos duas pilhas dinâmicas: uma denominada pilhaPrincipal e outra denominada pilhaAuxiliar. A pilhaPrincipal é utilizada como armazenamento da classe, enquanto a pilhaAuxiliar é usada, como o nome diz, para auxiliar nas operações.

* Novos elementos sempre devem ser sempre inseridos na pilhaPrincipal;

* Para remover um elemento, será necessário utilizar a pilhaAuxiliar. Uma pilha sempre remove o último elemento que foi inserido, enquanto a fila sempre remove o primeiro elemento inserido. Para ter acesso ao primeiro elemento, será necessário remover os elementos da pilhaPrincipal e adicioná-los na pilhaAuxiliar, até que reste apenas um elemento na pilhaPrincipal. Feito isso, guarda-se o último elemento da pilhaPrincipal em uma variável temporária, removendo-o da pilhaPrincipal, e todos os elementos na pilhaAuxiliar são devolvidos para a pilhaPrincipal. Ao final, retorna-se o elemento guardado na variável temporária.

* Para imprimir, mova todo o conteúdo da pilhaPrincipal para a pilhaAuxiliar. Após mover todos os elementos, comece a devolver da pilhaAuxiliar para a pilhaPrincipal, imprimindo os valores durante a devolução.
 
* A função main já tem alguns valores de teste, e você deverá ver a seguinte sequência de saída se seus métodos estiverem corretos:

Fila: 73 51 17
Elemento removido: 73
Fila: 51 17 42
Tamanho da fila: 3
Elemento removido: 51
Elemento removido: 17
Elemento removido: 42
Fila vazia? True



