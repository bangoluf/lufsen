import java.util.Scanner;

public class Browser {

    public static void main(String[] arg) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Skriv en textrad att söka i: ");
        String textrad = kb.nextLine();
        System.out.println("Skriv ord att söka efter: ");
        String sokord = kb.nextLine();

        int index = textrad.indexOf(sokord);
        int count = 0;
        while (index != -1) {
            index = textrad.indexOf(sokord + 1);
            count = count + 1;
            System.out.println("Ordet " + sokord + " hittades " + count + " gånger.");


        }

    }
}
