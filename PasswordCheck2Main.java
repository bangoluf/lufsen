package bibliotek;

import java.util.Scanner;


public class PasswordCheck2Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Välj ett lösenord: ");
        String passwd_input = input.nextLine();

        if (PasswordCheck2.testPw(passwd_input) && !PasswordCheck2.checkWordlist(passwd_input)) {
            System.out.println("Lösenordet är säkert.");
            System.out.println(PasswordCheck2.checkWordlist(passwd_input));
        } else {
            System.out.println("Lösenordet är inte säkert.");
            System.out.println(PasswordCheck2.checkWordlist(passwd_input));
        }
    }
}