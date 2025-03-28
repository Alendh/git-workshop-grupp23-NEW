import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Alend alend = new Alend();
        SuperEpicClass epicClass = new SuperEpicClass();
        Nini nini = new Nini();
        BirgittaEmanuel birgitta = new BirgittaEmanuel();


        System.out.println("COOL MENU - pick one");
        System.out.println("1. Alend hello");
        System.out.println("2. Alend food");
        System.out.println("3. Birgitta hello");
        System.out.println("4. Birgitta food");
        System.out.println("5. Nini hello");
        System.out.println("6. Nini food");
        System.out.println("7. Epic hello");
        System.out.println("8. Epic food");
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        switch (input) {
            case 1:
                alend.hello();
                break;
            case 2:
                alend.food();
            case 3:
                birgitta.hello();
                break;
            case 4:
                birgitta.food();
            case 5:
                nini.hello();
                break;
            case 6:
                nini.food();
            case 7:
                epicClass.hello();
                break;
            case 8:
                epicClass.food();
                break;
            default:
                System.out.println("Klassen existerar inte");
                break;
        }
    }
}
