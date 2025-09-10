package aula06;

public class ListaDupla<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private String nomeLista;
    private int tamanho;

    public ListaDupla(){
        this("Lista Dupla");
    }
    public ListaDupla(String nomeLista){
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanho = 0;
    }
    public void atualizaIndice(){
        NoDuplo<T> atual = primeiroNo;
        int indice = 0;

        while(atual != null){
            atual.setIndice(indice);
            atual.getProximoNo();
            indice++;
        }
    }

    public void AddInicio(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
        if(primeiroNo == null){
            primeiroNo = ultimoNo = novoNo;
        }else{
            novoNo.setProximoNo(primeiroNo);
            primeiroNo.setAnteriorNo(novoNo);
            primeiroNo = novoNo;

            atualizaIndice();
            this.tamanho++;
            
        }
    }
    public void AddFinal(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
         if(ultimoNo == null){
            primeiroNo = ultimoNo = novoNo;
        }else{
            novoNo.setAnteriorNo(ultimoNo);
            ultimoNo.setProximoNo(novoNo);
            ultimoNo = novoNo;
        }
        atualizaIndice();
        tamanho++;
    }
    // public int size(){
    //     // return ultimoNo.getIndice() + 1;
    // }

    public void imprimeLista(){
        NoDuplo<T> atual = primeiroNo;
        if (primeiroNo == null) {
            System.out.println("Lista Vazia");
        }else{
            while (atual != null) {
                atual.toString();
                atual = atual.getProximoNo();
            }
        }

        
    }

}
