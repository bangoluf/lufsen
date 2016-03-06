import java.util.Random;

public class RollingDice {
    public static void main(String[] arg) {
        Random numberGen = new Random();
        int tarning_1 = numberGen.nextInt(6) + 1;
        int tarning_2 = numberGen.nextInt(6) + 1;

        int summaTarningar = tarning_1 + tarning_2;
        System.out.println("Datorn kastar 2 st tärningar...");
        System.out.println("Tärning 1: " + tarning_1);
        System.out.println("Tärning 2: " + tarning_2);
        System.out.println("Summa av Tärningar: " + summaTarningar);
    }
}
