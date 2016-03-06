public class CalculateInterest {


        public static double calculateLoan(int money, int years, double interest) {

            interest = (interest / 100.0) + 1;

            double loan = money * Math.pow(interest, years);

            return loan;
        }
}
