package practice;

import java.util.Scanner;

public class Order {
    Scanner scan = new Scanner(System.in);
    Item item = new Item();

    double makeOrder() {
        double totalPrice = 0;
        int wantToContinue = 1;
        int userChoice;
        while (wantToContinue == 1) {
            System.out.println("Enter the number of item you want to buy!");
            if (scan.hasNextInt()) {
                userChoice = scan.nextInt();
                if (userChoice > 0 && userChoice < 6) {
                    totalPrice += item.Items[userChoice - 1];
                    System.out.println("Do you want to continue ordering?(1 - Yes/ 0 - No)");
                    wantToContinue = scan.nextInt();
                } else {
                    System.out.println("Enter number from 1 to 5!!!");
                }
            } else {
                System.out.println("You entered something wrong!");
                scan.next();
            }

        }
        return totalPrice;
    }

    void orderInfo(double orderPrice, double saleAmount, double finalPrice) {
        System.out.println("\n-------------------------------------");
        System.out.printf("Price without discount: %.2f\n", orderPrice);
        System.out.printf("Discount: %.2f\n", saleAmount);
        System.out.printf("Price with discount: %.2f\n", finalPrice);
        System.out.println("-------------------------------------");
    }
}
