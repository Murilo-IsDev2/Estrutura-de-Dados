package aula03;
public class Lista<T> {
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeLista;

    public Lista(){
        this("Lista");
    }
    public Lista(String nomeLista){
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public No<T> getPrimeiroNo() {
        return primeiroNo;
    }
    public void setPrimeiroNo(No<T> primeiroNo) {
        this.primeiroNo = primeiroNo;
    }
    public No<T> getUltimoNo() {
        return ultimoNo;
    }
    public void setUltimoNo(No<T> ultimoNo) {
        this.ultimoNo = ultimoNo;
    }

    public void imprimeLista(){
        if(primeiroNo == null){
            System.out.println("Lista Vazia!");
        }else{
            System.out.println("Dados da Lista" + this.nomeLista + ":");
            No<T> aux = primeiroNo;
            while(aux != null){
            System.out.println(aux.toString());
            aux = aux.getNextNo();
        } 
        }
    }

    public void addInicio(T dado){
        No<T> novoNo = new No<T>(dado);
        if(primeiroNo == null){
            primeiroNo = ultimoNo = novoNo;
        }else{
            novoNo.setNextNo(primeiroNo);
            primeiroNo = novoNo;
        }
    }

    public void removeInicio(){
        if(primeiroNo == null){
            System.out.println("Lista vazia");
        }else{
            System.out.println("Dado removido: " + primeiroNo);
            primeiroNo = primeiroNo.getNextNo();

            if(primeiroNo == ultimoNo){
                ultimoNo.setDado(null);
            }
        }
    }

    public void addFinal(T dado){
        No<T> novoNo = new No<T>(dado);
        if(primeiroNo == null){
            primeiroNo = ultimoNo = novoNo;
        }else{
            ultimoNo.setNextNo(novoNo);
            ultimoNo = novoNo;
        }
    }

    // public void removeFinal(){
    //      if(primeiroNo == null){
    //         System.out.println("Lista vazia");
    //     }else{
    //         No<T> aux = primeiroNo;
    //         while(aux != null){
    //         if(aux.getNextNo() == ultimoNo){
    //             No<T> NodeAjuda = aux;
    //             ultimoNo = NodeAjuda;
    //             ultimoNo.setNextNo(null);
    //         }
    //         aux = aux.getNextNo();

    //         } 
    //     }

        
    // }

    public void removeFinal(){
        if(primeiroNo == null){
            System.out.println("Lista vazia");
        }else{
            No<T> aux = primeiroNo;
            while(aux.getNextNo() != ultimoNo){
                aux = aux.getNextNo();
            }
            ultimoNo = aux;
            aux.setNextNo(null);

        } 
    }

    public void addMeio(T dado, T queroEncontrar){
        No<T> novoNo = new No<T>(dado);
        No<T> aux = primeiroNo;
            while(aux != null){
                if (aux.getDado() == queroEncontrar) {
                    novoNo.setNextNo(aux.getNextNo());
                    aux.setNextNo(novoNo);
                    break;
                }
            aux = aux.getNextNo();
            } 
    }

    public void removeMeio(T queroEncontrar){
        No<T> aux = primeiroNo;
            while(aux != null){
                if (aux.getNextNo().getDado() == queroEncontrar) {
                    aux.setNextNo(aux.getNextNo().getNextNo());
                    break;
                }
            aux = aux.getNextNo();
            } 
    }
}
