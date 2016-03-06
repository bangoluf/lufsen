import java.util.Scanner;

public class ConvertingStrings {
    public static void main(String[] arg) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Skriv ditt födelsedatum i formatet YYYY-MM-DD: ");
        String datum = kb.nextLine();
        int index = datum.indexOf("-");

        String year = datum.substring(0, index);
        int yearInt = Integer.parseInt(year);

        int age = 2016 - yearInt;

        System.out.println("Du är " + age + " år.");

    }
}
