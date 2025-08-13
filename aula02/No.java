package aula02;

class No<T>{
    private T dado;
    private No<T> nextNo;

    public No(){
        this(null, null);
    }

    public No(T dado, No<T> nextNo){
        this.dado = dado;
        this.nextNo = nextNo;
    }

    public T getDado(){
        return dado;
    }

    public void setDado(T dado){
        this.dado = dado;
    }

    public No<T> getNextNo(){
        return this.nextNo;
    }
    public void setNextNo(No<T> nextNo){
        this.nextNo = nextNo;
    }

    public String toString(){
        return "Tipo do dado: " + dado + " Próximo Nó: " + nextNo;
    }
}
