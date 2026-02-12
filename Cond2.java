public class Cond2 {
    public static void main(String[] args) {
        System.out.println("Hello world");

    
        double n1 = 5;
        double n2 = 6;

        double result = Math.max(n1, n2);

        if (n1 == n2) {
            System.out.println("The numbers are equal!");
        }
        else {
            System.out.println("The number " + result + " is the greater!");
        }

    }
}
