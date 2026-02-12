public class BFE5 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        double result = calculateSalary(1000, 10, 300);
        System.out.println(result);
    }

    static double calculateSalary(double real, double bonus, double deduction) {
        bonus = real * (bonus / 100);
        return real + bonus - deduction;     
    }
}
