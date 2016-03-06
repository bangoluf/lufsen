// läs in mediets kapacitet i Gbyte och läshastighet i Mbit / sec från användaren

// konvertera kapciteten till bits, bits = Bytes x 8

// konvertera Gbits till Mbits

// beräkna tiden
import java.util.Scanner;

public class TimeEstimation {
   
   public static void main(String[] args) {
      Scanner tangentbord = new Scanner(System.in);
      System.out.println("Skriv kapaciteten i gigabyte på lagringsmediumet: ");
      int gigaByte = tangentbord.nextInt();
      
      // konvertera till Mbyte
      int gbyteSomMbyte = gigaByte * 1024;
      // konvertera till Mbit
      int kapacitetMbit = gbyteSomMbyte * 8;
      
      System.out.println("Skriv läshastigheten i Mbit/s på lagringsmediumet: ");
      int lasHastighet = tangentbord.nextInt();
      
      int tidSekunder = kapacitetMbit / lasHastighet;
      
      // konvertera till timmar, minuter och sekunder med den tidigare skapade metoden
      Time.computeTime(tidSekunder);
   
   }
}