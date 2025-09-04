package TivoliRide;

import java.util.Scanner;

public class TivoliRideTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user height
        System.out.print("How tall are you? (In real measurements)");
         int height = input.nextInt();

         // Create objects
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
