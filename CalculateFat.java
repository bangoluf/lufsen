package bibliotek;

public class CalculateFat {

    public static double calcFat (double bmi, int kon, int alder) {
        double faktor;
        if (kon == 1) {
            faktor = 16.2;
        } else {
            faktor = 5.4;
        }

        return (1.2 * bmi) + (0.23 * alder) - faktor;


    }

}