package aula06;

class NoDuplo<T> {
    private T dado;
    private NoDuplo<T> proximoNo;
    private NoDuplo<T> anteriorNo;
    private int indice;

    public NoDuplo(T dado){
        this(dado, null);
    }
    public NoDuplo(T dado, NoDuplo<T> proximoNo, NoDuplo<T> anteriorNo ){
        this.dado = dado;
        this.proximoNo = proximoNo;
    }


    public T getDado() {
        return this.dado;
    }
    public void setDado(T dado) {
        this.dado = dado;
    }
    public NoDuplo<T> getNextNo() {
        return this.nextNo;
    }
    public void setNextNo(NoDuplo<T> nextNo) {
        this.nextNo = nextNo;
    }

    @Override
    public String toString(){
        return "Dado{" + getDado() + "}";
    }
}

