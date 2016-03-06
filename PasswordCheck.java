import java.util.Scanner;
import java.util.regex.*;

/*
input: en string
output: om lösenordet:
                        är minst 8 tecken långt,
                        innehåller minst en siffra 0-9,
                        innehåller minst en stor bokstav,
                        innehåller minst en liten bokstav,
                        innehåller minst ett icke-alfanumeriskt tecken.

 */

public class PasswordCheck {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Välj ett lösenord: ");
        String passwd_input = input.nextLine();

        String pattern_passwd = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*]).{8,})";
        Pattern p = Pattern.compile(pattern_passwd);
        Matcher m = p.matcher(passwd_input);

        if (m.matches()) {
            System.out.println("Lösenordet godkänt.");
        } else {
            System.out.println("Lösenordet måste innehålla: minst en siffra," +
                    " minst en stor bokstav," +
                    " minst en liten bokstav, " +
                    "minst ett icke-alfanumeriskt tecken och vara minst 8 tecken långt.");
        }






    }

}
