

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Rafael Marinho", 33);
        Pessoa p2 = new Pessoa("Gelnecy", 33);
        Pessoa p3 = new Pessoa("Mauricin", 40);

        ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
        listaPessoas.add(p1);
        listaPessoas.add(p2);
        listaPessoas.add(p3);

        System.out.println(listaPessoas.get(0));
        System.out.println(listaPessoas.get(1));
        System.out.println(listaPessoas.get(2));

        for (Pessoa auxP : listaPessoas) {
            System.out.println(auxP.toString());
        }

    }
}
