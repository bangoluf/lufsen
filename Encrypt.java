import java.util.*;

public class Encrypt {

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Write a text to enkrypt");
        String text = scan.nextLine();


        System.out.println("Krypterad: " + encrypt(text));
        System.out.println("Avkrypterad: " + decrypt(encrypt(text)));
    }

    public static String encrypt(String klar_text) {
        String krypt_text = "";

        for (int i = 0; i < klar_text.length(); i++) {
            int ascii_ny = (int) klar_text.charAt(i) + klar_text.length();
            krypt_text += ((char) ascii_ny);
        }

        return krypt_text;

    }

    public static String decrypt(String krypt_text) {
        String avkrypteradText = "";

        for (int i = 0; i < krypt_text.length(); i++) {
            int avkrypteradBokstav = (int) krypt_text.charAt(i) - krypt_text.length();
            avkrypteradText += ((char) avkrypteradBokstav);
        }

        return avkrypteradText;
    }
}