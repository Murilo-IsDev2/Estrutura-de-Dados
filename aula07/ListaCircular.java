public class ListaCircular<T>{
    private String nomeListaCircular;
    private No<T> primeiroNo;

  
    public ListaCircular(){
        this.nomeListaCircular = "Lista Circular";
    }
    public ListaCircular(String nomeListaCircular){
        this.nomeListaCircular = nomeListaCircular;
        this.primeiroNo = null;
    }

    public void addInicio(T dado){
        No<T> novoNo = new No<T>(dado);
        if(primeiroNo == null){
            primeiroNo = novoNo;
            novoNo.setNextNo(novoNo);
        }else{
            novoNo.setNextNo(primeiroNo);
        }
    }

    public void addFinal(T dado){
        No<T> novoNo = new No<T>(dado);
        No<T> aux = primeiroNo;
        if(primeiroNo == null){
            primeiroNo = novoNo;
            primeiroNo.setNextNo(primeiroNo);
        }else{
            while (aux.getNextNo() == primeiroNo) {
                novoNo.setNextNo(primeiroNo);
                aux.setNextNo(novoNo);
            }
        }   
        
    }



    public void imprimeLista(){
        
        if(primeiroNo == null){
            System.out.println("vazia");
        }else{
            No<T> aux = primeiroNo;
            if(aux.getNextNo() == primeiroNo){
                aux.toString();
                return;
            }
            while(aux.getNextNo() != primeiroNo){
                aux.toString();
                aux = aux.getNextNo();
            }
        }
    }

    public String getNomeListaCircular() {
        return nomeListaCircular;
    }
    public void setNomeListaCircular(String nomeListaCircular) {
        this.nomeListaCircular = nomeListaCircular;
    }
    public No<T> getPrimeiroNo() {
        return primeiroNo;
    }
    public void setPrimeiroNo(No<T> primeiroNo) {
        this.primeiroNo = primeiroNo;
    }
}