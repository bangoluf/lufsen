package bibliotek;

public class CalculateBmi
{
    public static double CalcBmi(double vikt, double langd) {
        double langdToMeter = langd / 100;
        return vikt / (langdToMeter * langdToMeter);

   }

}