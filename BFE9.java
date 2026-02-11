import java.util.Scanner;

public class BFE9 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner sc = new Scanner(System.in);

        double amount = sc.nextDouble();
        int installments = sc.nextInt();

        double valueInstallment = amount / installments;
        
        System.out.println("Your purchase of R$" + amount  + " in " + installments + "installments of R$" + valueInstallment + " has been completed!");

        sc.close();
    }
}
