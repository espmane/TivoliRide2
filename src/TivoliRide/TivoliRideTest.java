package TivoliRide;

import java.util.Scanner;

public class TivoliRideTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get which ride
        System.out.print("""
                Hvilken ride vil du på?
                Muligheder:
                
                LegoRide
                BatmanRide
                TivoliRide
                """);
        String rideName = input.nextLine();

        // Get user name
        System.out.println("Hvad er dit navn?");
        String name = input.nextLine();

        // Get user height
        System.out.println("Hvor høj er du? (I centimeter)");
        int height = input.nextInt();

        // Objects
        Person person = new Person(height,name);
        TivoliRide LegoRide = new TivoliRide(130);
        TivoliRide BatmanRide = new TivoliRide(150);
        TivoliRide TivoliRide = new TivoliRide(140);

        if (rideName.equalsIgnoreCase("TivoliRide")) {
            // Check if they're tall enough
            if (person.height > TivoliRide.minHeight) {
                System.out.println(person.name + ", velkommen til TivoliRide");
            } else {
                System.out.println(person.name + ", du er ikke høj nok til TivoliRide");
            }
        } else if (rideName.equalsIgnoreCase("LegoRide")) {
            if (person.height > LegoRide.minHeight) {
                System.out.println(person.name + ", velkommen til LegoRide");
            } else {
                System.out.println(person.name + ", du er ikke høj nok til LegoRide");
            }
        } else if (rideName.equalsIgnoreCase("BatmanRide")) {
            if (person.height > BatmanRide.minHeight) {
                System.out.println(person.name + ", velkommen til BatmanRide");
            } else {
                System.out.println(person.name + ", du er ikke høj nok til BatmanRide");
            }
        } else {
            System.out.println("Ikke gyldigt input, prøv igen");
        }
    }
}