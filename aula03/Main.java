package aula03;
public class Main {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>("Alunos");
        lista.addInicio("Murilo");
        lista.addInicio("Mauricin");
        lista.addInicio("Rafael");
        
  
        lista.addMeio("Murilo", "Mauricin");
        lista.imprimeLista();
    }
}
