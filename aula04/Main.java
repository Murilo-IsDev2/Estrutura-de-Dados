package aula04;

public class Main {
    public static void main(String[] args) {
        Pilha<String> novaPilha = new Pilha<String>("Alfabeto");
        novaPilha.push("A");
        novaPilha.push("B");

        System.out.println("Dado do topo: " + novaPilha.peek());
        
        System.out.println("DADO REMOVIDO: " + novaPilha.pop());
        novaPilha.imprimePilha();
    }
}
