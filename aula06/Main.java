public class Main {
    public static void main(String[] args) {
        ListaDupla<String> lista = new ListaDupla<String>("Alunos");
    
        lista.addFinal("Murilo");
        lista.addFinal("Mauricin");
        lista.addFinal("Gel");
        
        lista.RemoveMeio(1);
        lista.imprimeLista();
    }
}
