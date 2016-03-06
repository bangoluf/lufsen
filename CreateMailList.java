import java.io.*;
import java.util.*;


public class CreateMailList {

    public static void main(String[] str) {
        File file = new File("klasslista.txt");

        try {
            Scanner filescan = new Scanner(file);
            // nedan kod läser från filen rad för rad och
            // skriver ut den till output.
            while (filescan.hasNext()) {
                String line = filescan.nextLine();
                String email = create_email(line);
                System.out.println(line + "    email:    " + email);
            }
        } catch (Exception e) {
            System.out.print("Exception: ");
            System.out.println(e.getMessage());
            System.err.println(file.getAbsolutePath());
        }
    }

    public static String create_email(String namn) {
        System.out.println("namn: " + namn);
        String treForstaFornamn = namn.substring(0, 2);
        int posEfternamn = namn.indexOf(" ") + 1;
        String fyraForstaEfternamn = namn.substring(posEfternamn, posEfternamn + 3);

        String doman = "@student.hh.se";
        return treForstaFornamn + fyraForstaEfternamn + doman;
    }
}