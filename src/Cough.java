
import java.util.Scanner;

public class Cough extends Covid {
    Scanner scan = new Scanner(System.in);
    boolean y = true;
    boolean n = false;

    void covidSympton2() {
        System.out.println("Does patient have any symptom for Cough? (y/n)");
        String Fever = scan.nextLine();

        if (true) {
            System.out.println("How long has patient had this symptom for?");
            String sympton = scan.nextLine();
        }
    }
}