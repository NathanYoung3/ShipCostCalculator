import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double cost;
        double shipping;
        double shippingPercent = 0.02;
        double total;
        int max = 100;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the price of an item.");
        if (scan.hasNextDouble()) {
            cost = scan.nextDouble();
            if (cost > 0 && cost < max) { //if number is under 100
                shipping = cost * shippingPercent;
                total = cost + shipping;
                System.out.println("The cost of shipping is " + shipping + ", bringing the total price to " + total + ".");
            } else if (cost > 0 && cost >= max) { //if number is over 100
                System.out.println("There is no shipping cost. The total cost will be " + cost + ".");
            } else { //this happens if number is under 0
                System.out.println("You have entered an invalid value.");
                System.exit(0);
            }
        } else { //if number is not number
            System.out.println("You have entered an invalid data type.");
            System.exit(0);
        }
    }
}