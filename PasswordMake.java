/*
import java.util.*;

public class PasswordMake {
    Random random = new Random();

    String tecken = random.nextInt(( - min) + 1) + min;

}


    final static String smaBokstaver = "abcdefghijklmnopqrstuvwxyz";
    final static String storaBoksaver = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final static String siffror = "0123456789";
    final static String symboler = "!@#$%^&";

        public static void main(String[] args) {
            Random random = new Random();
            int langd = 8;
            String blanda = "";
            String losenord = "";

            for (int a = 0; a < 2; a++) {
            blanda += smaBokstaver.charAt(random.nextInt(smaBokstaver.length()) );
                System.out.println("Sma: " + blanda);
            blanda += storaBoksaver.charAt(random.nextInt(storaBoksaver.length()) );
                System.out.println("Stora: " + blanda);
            blanda += siffror.charAt(random.nextInt(siffror.length() ));
                System.out.println("siffror: " + blanda);
            blanda += symboler.charAt(random.nextInt(symboler.length()) );
                System.out.println("symboler: " + blanda);
            }


            for (int b = 0; b < langd; b++) {
                losenord += blanda.charAt(random.nextInt(blanda.length()) );
            }

            System.out.println(losenord);
        }
}

*/
