public class BFE3 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        double result = convertDollarToReal(10, 0);
        System.out.printf("%.2f", result);
    }

    static double convertDollarToReal(double dollar, double real) {
        return dollar * 5.19;
    }
}
