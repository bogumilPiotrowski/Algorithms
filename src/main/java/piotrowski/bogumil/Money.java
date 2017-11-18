package piotrowski.bogumil;

public class Money {

    public static int calculateYears(double principal, double interest,  double tax, double desired) {

        int years = 0;


        if (principal >= desired) {
            return years;
        }


        double target = principal;
        while (target <= desired) {

            double income = interest * target;
            double outgo = income * tax;
            target = target + income - outgo;
            years++;
        }


        return years;
    }
}