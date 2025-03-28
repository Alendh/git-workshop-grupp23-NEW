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
                new Nini();
                break;
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
