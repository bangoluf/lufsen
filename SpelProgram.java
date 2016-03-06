package vecka_6;

import java.util.Scanner;

public class SpelProgram {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Spelare 1: Skriv ditt namn: ");
        Spelare spelare1 = new Spelare(scan.nextLine());
        System.out.print("Spelare 2: Skriv ditt namn: ");
        Spelare spelare2 = new Spelare(scan.nextLine());

        SpelMeny.printInfo();
        int choice = 5;
        int turn = 1;

        //while (choice != 9) {
            switch (turn) {

                case 1:
                    SpelMeny.printMenu(spelare1);
                    choice = scan.nextInt();
                    SpelMeny.kasta(choice, spelare1);
                   // if (spelare1.getPoäng() > 21) {
                   //     System.out.println("Du fick över 21 poäng! " + spelare2.getNamn() + " vinner!");
                   //     spelare1.nollStall();
                   //     spelare2.nollStall();
                   // }
                    turn = 2;
                    break;

                case 2:
                    SpelMeny.kasta(choice, spelare2);
                    SpelMeny.printMenu(spelare2);
                    if (spelare2.getPoäng() > 21) {
                        System.out.println("Du fick över 21 poäng! " + spelare1.getNamn() + " vinner!");
                        spelare1.nollStall();
                        spelare2.nollStall();
                        break;
                    } else if(spelare2.getKast() != 0) {
                        SpelMeny.printMenu(spelare2);
                    }

                    break;
            }
       // }
    }
}
