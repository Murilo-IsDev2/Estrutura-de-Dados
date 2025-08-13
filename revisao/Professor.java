public class Professor extends Pessoa {
    
    private int idProfessor;


    public Professor(String nome, int idade, long cpf, int idProfessor){
        super(nome, idade, cpf);
        this.idProfessor = idProfessor;
    }

    public String toString(){
        return String.format(super.toString() + " Id Professor: " + this.idProfessor);
    }

    public int getIdProfessor() {
        return idProfessor;
    }


    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }
}
