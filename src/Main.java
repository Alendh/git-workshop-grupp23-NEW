import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv klass namn: ");

        Alend alend = new Alend();
        SuperEpicClass epicClass = new SuperEpicClass();
        Nini nini = new Nini();
        BirgittaEmanuel birgitta = new BirgittaEmanuel();



        String input = scanner.nextLine();
        switch (input) {
            case "Alend":
                alend.hello();
                break;
            case "Alend food":
                alend.food();
            case "BirgittaEmanuel":
                birgitta.hello();
                break;
            case "BirgittaEmanuel food":
                birgitta.food();
            case "Nini":
                nini.hello();
                break;
            case "Nini food":
                nini.food();
            case "SuperEpicClass":
                epicClass.hello();
                break;
            case "EpicFood":
                epicClass.food();
                break;
            default:
                System.out.println("Klassen existerar inte");
                break;
        }
    }
}
