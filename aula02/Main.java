package aula02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        No<String> obj1 = new No<String>("Murilo");
        No<String> obj2 = new No<String>("João Lucas");
        No<String> obj3 = new No<String>("Ítalo");
        No<String> obj4 = new No<String>("Maria Flor");

        // System.out.println(obj1.toString());
        // System.out.println(obj2.toString());
        // System.out.println(obj3.toString());
        // System.out.println(obj4.toString());

        obj1.setNextNo(obj2);

        // System.out.println(obj1.getNextNo().toString());

        obj2.setNextNo(obj3);
        // System.out.println(obj2.getNextNo().toString());

        obj3.setNextNo(obj4);
        // System.out.println(obj3.getNextNo().toString());


        // System.out.println(obj1.toString());
        // System.out.println(obj1.getNextNo().toString());
        // System.out.println(obj1.getNextNo().getNextNo().toString());
        // System.out.println(obj1.getNextNo().getNextNo().getNextNo().toString());

        No<String> aux = obj1;

        while(aux != null){
            System.out.println(aux.toString());
            aux = aux.getNextNo();
        }

    }
}
