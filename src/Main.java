import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv klass namn: ");

        String input = scanner.nextLine();
        switch (input) {
            case "Alend":
                new Alend();
                break;
            case "BirgittaEmanuel":
                new BirgittaEmanuel();
                break;
            case "Nini":
                Nini nini = new Nini();
                nini.hello();
                break;
            case "Nini food":
                Nini nini2 = new Nini();
                nini2.food();
                break;
            case "Nini drink":
                Nini nini3 = new Nini();
                nini3.drink();
            case "SuperEpicClass":
                new SuperEpicClass();
                break;
            case "EpicFood":
                SuperEpicClass.food();
            default:
                System.out.println("Klassen existerar inte");
                break;
        }
    }
}
