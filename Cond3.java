public class Cond3 {
    public static void main(String[] args) {
        System.out.println("Hello world");

        String color = "red ".toLowerCase().trim();

        if (color.equals("red")) {
            System.out.println("You cant cross the road for now!");
        }
        else if (color.equals("yellow")) {
            System.out.println("Atention!");
        }
        else if (color.equals("green")){
            System.out.println("You can cross the road!");
        }
        else {
            throw new IllegalArgumentException("Invalid Color");
        }
    }
}

// .toLowerCase().trim() => I added this to help with comparisons when using Scanner
