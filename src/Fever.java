import java.util.Scanner;

public class Fever extends Covid {
    Scanner scan = new Scanner(System.in);
    boolean y = true;
    boolean n = false;

    void covidSympton1() {
        System.out.println("Does patient have any symptom for Fever? (y/n)");
        String Fever = scan.nextLine();

        if (true) {
            System.out.println("How long has patient had this symptom for?");
            String sympton = scan.nextLine();
        }
    }
}