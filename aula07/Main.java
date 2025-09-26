public class Main {
    public static void main(String[] args) {
        ListaCircular<String> listaCircular = new ListaCircular<String>("Teste");
        listaCircular.imprimeLista();
        System.out.println("Teste");
        listaCircular.addFinal("Primeiro");
        listaCircular.imprimeLista();

        System.out.println("Tese");
    }

}
