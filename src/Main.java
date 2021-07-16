import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        //Welcome User Message
        System.out.println("Contact Tracing Program\n");

        //User Enters Information
        System.out.println("Enter a newly infected person's information");
        System.out.println("What is a patient name?");
        String name = scan.nextLine();

        System.out.println("What is a patient phone number?");
        String number = scan.nextLine();

        System.out.println("What is a patient email address?");
        String address = scan.nextLine();

        System.out.println("What city does a patient live in?");
        String city = scan.nextLine();

        System.out.println("What state does a patient live in?");
        String state = scan.nextLine();

        //Space
        System.out.println("\n");


        //Ask User For Symptons
        Fever s1 = new Fever();
        s1.covidSympton1();

        Cough s2 = new Cough ();
        s2.covidSympton2();

        ShortnessOfBreath s3 = new ShortnessOfBreath ();
        s3.covidSympton3();

        Tiredness s4 = new Tiredness ();
        s4.covidSympton4();

        Aches s5 = new Aches ();
        s5.covidSympton5();

        Chills s6 = new Chills ();
        s6.covidSympton6();

        SoreThroat s7 = new SoreThroat ();
        s7.covidSympton7();

        LossOfTaste s8 = new LossOfTaste ();
        s8.covidSympton8();

        LossOfSmell s9 = new LossOfSmell ();
        s9.covidSympton9();

        Headache s10 = new Headache ();
        s10.covidSympton10();


        //Print User Report
        System.out.println("***** Contact Tracing Report *****");
        System.out.println("Name: " + name);
        System.out.println("Number: " + number);
        System.out.println("Address: " + address);
        System.out.println("City: " +city+" "+ "State:" +state);
    }
}
