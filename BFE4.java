public class BFE4 {
    public static void main(String[] args) {

        double result = calculateAverage(5, 6, 1);

        if (result >= 5) {
            System.out.printf("Approved! Your grade is: %.2f\n", result);
        } else {
            System.out.printf("Failed... Your grade is: %.2f\n", result);
        }
    }

    static double calculateAverage(double g1, double g2, double g3) {
        return (g1 + g2 + g3) / 3;
    }
}
