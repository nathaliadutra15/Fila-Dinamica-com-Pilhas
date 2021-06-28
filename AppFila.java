//Nathália Dutra de Oliveira - 21478253

public class AppFila {
    public static void main(String[] args) {
        FilaDinamica f = new FilaDinamica();

        f.entra(73);
        f.entra(51);
        f.entra(17);

        System.out.println("Elemento removido: " + f.sai());

        f.entra(42);

        System.out.println("Tamanho da fila: "+ f.tamanho());

        System.out.println("Elemento removido: "+ f.sai());
        System.out.println("Elemento removido: "+ f.sai());
        System.out.println("Elemento removido: "+ f.sai());

        System.out.println("Fila vazia? " + f.isEmpty());
    }
    
}
