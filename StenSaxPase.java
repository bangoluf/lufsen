import java.util.Scanner;
import java.util.Random;

public class StenSaxPase {

    public static void main(String[] args) {

        String personPlay = "";
        String computerPlay = "";
        int computerInt;
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        System.out.println("R, P or S?: ");
        personPlay = scan.nextLine();

        computerInt = generator.nextInt(2);


        switch (computerInt) {
            case 0:
                computerPlay = "R";
                break;
            case 1:
                computerPlay = "P";
                break;
            case 2:
                computerPlay = "S";
                break;
            default:
                System.out.println("Error");
        }

        System.out.println("Computer plays: " + computerPlay);

        if (personPlay.equals("R")) {

            if (computerPlay.equals("P")) {
                System.out.println("Paper wins over rock. Computer wins.");
            }
            else if(computerPlay.equals("S")) {
                System.out.println("Rock crushes scissorc. Player wins.");
            }
        }
        else if(personPlay.equals("P")) {

            if(computerPlay.equals("S")) {
                System.out.println("Scissors cuts paper. Computer wins.");
            }
            else if(computerPlay.equals("R")) {
                System.out.println("Paper covers rock. Player wins.");
            }
        }
    }
}