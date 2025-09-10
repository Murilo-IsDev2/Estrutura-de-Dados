package aula06;


public class Main {
    public static void main(String[] args) {
        ListaDupla<String> lista = new ListaDupla<String>("Alunos");
        
        lista.AddInicio("Murilo");
        lista.addFinal("Mauricin");

        lista.imprimeLista();
    }
}
