import java.util.Scanner;

public class BuyHouse {

    public static void main(String[] arg) {
        int belopp, ranta, antalAr;

        Scanner kb = new Scanner(System.in);
        System.out.print("Skriv beloppet: ");
        belopp = kb.nextInt();

        System.out.print("Skriv räntan i procent: ");
        ranta = kb.nextInt();

        System.out.print("Skriv antal år: ");
        antalAr = kb.nextInt();

        System.out.println("Med räntan " + ranta + " kommer ditt lån öka till " +
                          CalculateInterest.calculateLoan(belopp, ranta, antalAr) +
                          "kr efter " + antalAr + " år");
    }
}