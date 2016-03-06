import java.util.Scanner;

public class TimeSecond
{
   
   public static void main(String[] args)
   {
      // Läs in sekunder från tangentbordet
      Scanner tangentbord = new Scanner(System.in);
      System.out.print("Skriv in antal sekunder: ");
      int totalaSekunder = tangentbord.nextInt();
      
      int sekunderTimmar = totalaSekunder / 3600;                            
      int resterandeTimmar = totalaSekunder % 3600;
      int sekunderMinuter = resterandeTimmar / 60;                             
      int sekunder = resterandeTimmar % 60;
      System.out.println("Total tid i timmar, minuter och sekunder: " 
      + sekunderTimmar + " Timmar " + sekunderMinuter + " Minuter " + sekunder + " Sekunder.");    
   }
}
