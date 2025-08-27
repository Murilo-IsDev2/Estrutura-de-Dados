package aula03;
public class Main {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>("Alunos");
        lista.addFinal("Murilo");
        lista.addFinal("Mauricin");
        lista.addFinal("Rafael");
        
        // lista.removeFinal();
        lista.removeMeio("Mauricin");
        

        
        lista.imprimeLista(); 
    }
}
