package aula05;
// queue
public class Fila<T>{
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeFila;

    public Fila(){
        this("Fila");
    }

    public Fila(String nomeFila){
        this.nomeFila = nomeFila;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void enfileirar(T dado){
        No<T> novoNo = new No<T>(dado);
        if(primeiroNo == null){
            primeiroNo = ultimoNo = novoNo;
        }else{
            ultimoNo.setNextNo(novoNo);
            ultimoNo = novoNo;
        }
    }

    public T desenfileirar(){
        if(primeiroNo == null){
            System.out.println("Fila " + nomeFila +"Vazia");
            return null;
        }

        T dadoTemp = primeiroNo.getDado();
        primeiroNo = primeiroNo.getNextNo();

        if(primeiroNo == null){
            ultimoNo = null;
        }
        return dadoTemp;
    }

    public void imprimeFila(){
        if(primeiroNo == null){
            System.out.println("Fila Vazia");
        }else{
            System.out.println(this.nomeFila);
            No<T> aux = primeiroNo;
            while(aux != null){
            System.out.println(aux.toString());
            aux = aux.getNextNo();
        } 
        }
        
    }

}
