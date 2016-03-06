package bibliotek;

import java.util.Scanner;

public class Calories {

    // METs
    static final int METlopning = 10;
    static final int basket = 8;
    static final int sova = 1;
    static final int golf = 5;
    static final int promenera = 4;

    static Scanner scan = new Scanner(System.in);
    static int vikt;
    static double total_calories;


    public static void main(String[] args) {

        System.out.println( " Kaloriförbruknings program");
        System.out.println( " Hur mycket väger du ?");
        vikt = scan.nextInt();
        printMenu();
        int choice = scan.nextInt();
        while (choice != 0) {
            dispatch(choice);
            printMenu();
            choice = scan.nextInt();
        }
    }

    // beräkna kaloriförbrukningen
    public static double beraknaKalorier(int met, int vikt, double tid) {
        return 0.0175 * met * vikt * tid;
    }


    public static void printMenu() {

        System.out.println("\n Välj aktivitet. Välj 4 när du är klar med alla val.");
        System.out.println("=========");
        System.out.println("0: Exit ");
        System.out.println("1: Löpning");
        System.out.println("2: Basket");
        System.out.println("3: Sova");
        System.out.println("4: Beräkna kalorier");
        System.out.print("\nMata in ditt val: ");
    }

    public static void dispatch(int choice) {
        switch (choice) {
            case 0:
                System.exit(0);
                break;

            case 1:
                System.out.println(" Hur lång tid har du sprungit ? Ange tiden i minuter: ");
                int löpning_tid = scan.nextInt();
                total_calories = total_calories + beraknaKalorier(METlopning, vikt, löpning_tid);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                System.out.println( " Förbrända kalorier är " +
                        total_calories);
                System.out.println( " Beräkningen börjar på nytt");
                        total_calories=0;
                break;
            default:
                System.out.println("Sorry, fel val");
        }
    }
}