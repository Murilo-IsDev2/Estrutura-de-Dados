public class Pessoa{
    private String nome;
    private long cpf;
    private int idade;

    public Pessoa(){
        this("",0,0);
    }

    public Pessoa(String nome, int idade){
        this(nome, idade, 0);
    
    }

    public Pessoa(String nome, int idade, long cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String toString(){
        return "Nome: " + this.nome + " Idade: " + this.idade + " Cpf:" + this.cpf;
        // return String.format("Nome: %s, CPF: %l, Idade: %i", this.nome, this.idade, this.idade);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public long getCpf(){
        return this.cpf;
    }

    public void setCpf(long cpf){
        this.cpf = cpf;
    }
}