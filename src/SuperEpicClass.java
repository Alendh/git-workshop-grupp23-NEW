import java.util.Scanner;

public class SuperEpicClass {

    Scanner scanner = new Scanner(System.in);

    public SuperEpicClass() {
        typeSomething();
    }

    public void typeSomething() {
        String something = scanner.nextLine();

        System.out.println(something);
    }

    public void hello() {
        System.out.println("Hello from SuperEpiccAss");
    }

    public static void food() {
        System.out.println("jag älskar hamburgezas");
    }
}
