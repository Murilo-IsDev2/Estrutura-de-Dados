package aula05;

public class Main {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<Integer>("Numeros Inteiros na Fila");
        fila.enfileirar(1);
        fila.enfileirar(2);
        
        fila.imprimeFila();

    }
}
