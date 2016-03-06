import java.util.Scanner;

public class TimeFirst
{
   
   public static void main(String[] args)
   {
      // Läs in timmar, minuter och sekunder från tangentbordet
      Scanner tangentbord = new Scanner(System.in);
      System.out.print("Skriv in antal timmar: ");
      int timmar = tangentbord.nextInt();
      System.out.print("Skriv in antal minuter: ");
      int minuter = tangentbord.nextInt();
      System.out.print("Skriv in antal sekunder: ");
      int sekunder = tangentbord.nextInt();
      
      int timmarSekunder = timmar * 60 * 60;                            // Konvertera minuter till sekunder
      int minuterSekunder = minuter * 60;                               // Konvertera minuter till sekunder
      int totalaSekunder = timmarSekunder + minuterSekunder + sekunder; // Beräkna totala sekunder
      System.out.println("Total tid i sekunder: " + totalaSekunder);    // Skriv ut totala antal sekunder
   }
}
