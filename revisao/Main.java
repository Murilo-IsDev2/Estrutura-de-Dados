public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Mauricin", 28);
        Pessoa p3 = new Pessoa("Gelciney", 35, 1234354354l);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        Aluno a1 = new Aluno("CLara", 20, 5454545454l, 1);
        Professor prf1 = new Professor("Coco", 78, 454656565l, 1);
    }
}