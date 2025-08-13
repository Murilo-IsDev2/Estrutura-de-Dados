public class Aluno extends Pessoa {
    
    private int idAluno;

    public Aluno(String nome, int idade, long cpf, int idAluno){
        super(nome, idade, cpf);
        this.idAluno = idAluno;
    }

    public String toString(){
        return String.format(super.toString() + " Id Aluno: " + this.idAluno);
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }
}
