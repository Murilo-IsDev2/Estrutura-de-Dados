public class Principal {
    public static void main(String[] args) {
        ArvoreAVL arvore = new ArvoreAVL();

        System.out.println("Inserindo valores 10, 20, 30...");
        arvore.inserir(20);
        arvore.inserir(15);
        arvore.inserir(12); 

        arvore.inserir(10); 
        arvore.inserir(8); 
        arvore.inserir(25); 

        arvore.inserir(35); 
        arvore.inserir(45); 
        arvore.inserir(50);
        
        arvore.imprimirPosOrdem();

       
    }
}