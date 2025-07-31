import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner password = new Scanner(System.in);

        System.out.print("Enter your password: ");
        int pass = password.nextInt();

        if (pass == 123) {
            System.out.println("Welcome Chethan");
        } else {
            System.out.println("Wrong password");
            return; // Exit if password is wrong
        }

        System.out.println("What do you want to purchase?");
        System.out.println("Options: fruits");
        String bag = password.next();

        if (bag.equalsIgnoreCase("fruits")) {
            System.out.println("Select fruits:");
            System.out.println("Options: apple or orange");
            String fruits = password.next();

            if (fruits.equalsIgnoreCase("apple")) {
                System.out.println("Apple is 20rs/kg");
                System.out.print("How many kgs? ");
                int apple = password.nextInt();
                int price = 20 * apple;
                System.out.println("Total price: " + price + " rs");
            } else if (fruits.equalsIgnoreCase("orange")) {
                System.out.println("Orange is 15rs/kg");
                System.out.print("How many kgs? ");
                int orange = password.nextInt();
                int price = 15 * orange;
                System.out.println("Total price: " + price + " rs");
            } else {
                System.out.println("Selected fruit not available.");
            }
        } else {
            System.out.println("Item not available for purchase.");
        }

        password.close();
    }
}
