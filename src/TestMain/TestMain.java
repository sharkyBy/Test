package TestMain;

import java.math.BigDecimal;
import java.util.Scanner;

public class TestMain {

    public static void main(String[] args) {

        BigDecimal weight;
        BigDecimal distance;

        BigDecimal pricePerKg = new BigDecimal("30");
        BigDecimal pricePerKm = new BigDecimal("50");

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Enter the weight in kilograms or 'q' for quit: ");
        String inputString = scanner1.nextLine();
        System.out.println("Enter the distance in kilometrs or 'q' for quit: ");
        String inputString2 = scanner2.nextLine();
        if (!inputString.equals("Q")) {
            weight = new BigDecimal(inputString);
            distance=new BigDecimal(inputString2);
        } else {
            System.out.println("\nBye!");
            return;
        }

        /*System.out.println("Enter the distance in kilometers or 'q' for quit: ");
        inputString = scanner.nextLine();
        if (!inputString.equals("Q")) {
            distance = new BigDecimal(inputString);
        } else {
            System.out.println("\nBye!");
            return;
        }*/

        System.out.println("Value of weight = " + weight);
        System.out.println("Value of distance = " + distance);

        BigDecimal price = weight.multiply(pricePerKg).add(distance.multiply(pricePerKm));
        System.out.println("Price = " + price);
    }
}