
public class Cond1 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println(compareGreater(5, 5, 6));
    }

    static String compareGreater (double n1, double n2, double n3) {
        
        if (n1 == n2 && n1 == n3) {
           return "The numbers are equal";
        }

        else {
            double result = Math.max(n3 ,Math.max(n1, n2));
            return "The greatest number is: " + result;
        }
    }
}


// I had some problems here because I wanted to use conditions.
// Java requires a method to always return the same type as declared.

