package TivoliRide;

import java.util.Scanner;

public class TivoliRideTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user height
        System.out.print("How tall are you? (In real measurements)");
         int height = input.nextInt();
        // TODO make a method that deals with inputs like: 1.80 1,80 180
        // read string instead and remove dot or comma, then parse to int


         // Objects
        Person person = new Person(height);
        TivoliRide ride  = new TivoliRide(130);

        // Check if they're tall enough
        if (person.height > ride.minHeight) {
            System.out.println("Welcome to TivoliRide");
        }
        else  {
            System.out.println("You're not tall enough for TivoliRide");
        }
    }
}
