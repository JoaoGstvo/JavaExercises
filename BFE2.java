public class BFE2 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        double result = convertRealToDollar(10, 0);
        System.out.printf("%.2f", result);
    }

    static double convertRealToDollar( double real, double dollar) {
        return real / 5.19;
    }
}

// Println does NOT format numbers.
// I need to use printf