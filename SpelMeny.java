package vecka_6;

public class SpelMeny {

    public static void kasta(int choice, Spelare spelare) {

        if (spelare.getKast() != 0) {

            switch (choice) {
                case 9:
                    System.exit(0);
                    break;

                case 0:
                    spelare.spela(0);
                    break;

                case 1:
                    spelare.spela(1);
                    break;

                case 2:
                    spelare.spela(2);
                    break;

                case 3:
                    spelare.spela(3);
                    break;

                case 4:
                    spelare.getPoäng();
                    break;

                default:
                    System.out.println("Du kan välja att kasta 0-3 tärningar.");
            }

            System.out.println("********************* \n  Namn: " + spelare.getNamn());
            System.out.println("*********************  \n Poang: " + spelare.getPoäng());
            System.out.println("*********************  \n Kast: " + spelare.getKast());

        } else {
            System.out.println("Du har redan kastat 3 gånger!");
        }
    }

    public static void printMenu(Spelare spelare) {
        System.out.println("==============");
        System.out.println(spelare.getNamn() + " tur att kasta: ");
        System.out.println(spelare.getNamn() + " POÄNG: " + spelare.getPoäng());
        System.out.println("ANTAL KAST KVAR: " + spelare.getKast());
        System.out.println("==============");
        System.out.println("9: Exit");
        System.out.println("0: Kasta 0 tärningar");
        System.out.println("1: Kasta 1 tärning");
        System.out.println("2: Kasta 2 tärningar");
        System.out.println("3: Kasta 3 tärningar");
        System.out.println("4: Se dina poäng");
        System.out.println("Mata in ditt val: ");
    }

    public static void printInfo() {
        System.out.println("\nSPELA BLACKJACK MED TÄRNING:");
        System.out.println("Spelaren närmast 21 poäng efter 3 kast vinner. 0-3 tärningar per kast.");
        System.out.println("Kommer man över 21 poäng har man förlorat.");
    }
}