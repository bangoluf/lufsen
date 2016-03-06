package bibliotek;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCheck2 {


    public static boolean checkWordlist(String losenord) {
        File file = new File("ordlista_sv.txt");
        String ordlistaLine = "";
        boolean match = false;



        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (losenord.indexOf(line) >= 0){
                    match = true;
                    break;
                }
            }


        } catch (Exception e) {
            System.out.print("Exception: ");
            System.out.println(e.getMessage());
        }

        return match;
    }


    public static boolean testPw(String losenord) {
        String pattern_passwd = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*]).{8,})";
        Pattern p = Pattern.compile(pattern_passwd);
        Matcher m = p.matcher(losenord);

        return m.matches();
    }

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