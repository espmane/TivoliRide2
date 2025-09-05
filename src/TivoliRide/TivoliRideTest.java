package TivoliRide;

import java.util.Scanner;

public class TivoliRideTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get which ride
        System.out.print("""
                Which ride would you like to go on?
                Options:
                LegoRide
                BatmanRide
                TivoliRide
                """);
        String rideName = input.nextLine();

        // Get user height
        System.out.print("How tall are you? (In real measurements)");
        int height = input.nextInt();

        // Objects
        Person person = new Person(height);
        TivoliRide LegoRide = new TivoliRide(130);
        TivoliRide BatmanRide = new TivoliRide(150);
        TivoliRide TivoliRide = new TivoliRide(140);

        if (rideName.equalsIgnoreCase("TivoliRide")) {
            // Check if they're tall enough
            if (person.height > TivoliRide.minHeight) {
                System.out.println("Welcome to TivoliRide");
            } else {
                System.out.println("You're not tall enough for TivoliRide");
            }
        } else if (rideName.equalsIgnoreCase("LegoRide")) {
            if (person.height > LegoRide.minHeight) {
                System.out.println("Welcome aboard the LegoRide");
            } else {
                System.out.println("You're not tall enough for the LegoRide");
            }
        } else if (rideName.equalsIgnoreCase("BatmanRide")) {
            if (person.height > BatmanRide.minHeight) {
                System.out.println("Welcome aboard the BatmanRide");
            } else {
                System.out.println("You're not tall enough for the BatmanRide");
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}