import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FlightManager manager = new FlightManager();

        int choice;

        do {
            System.out.println("\n=================================");
            System.out.println("   FLIGHT BOOKING SYSTEM");
            System.out.println("=================================");
            System.out.println("1. View Flights");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. View Bookings");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    manager.viewFlights();
                    break;

                case 2:
                    System.out.print("Enter Flight ID: ");
                    int flightId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Passenger Name: ");
                    String name = sc.nextLine();

                    manager.bookTicket(flightId, name);
                    break;

                case 3:
                    System.out.print("Enter Booking ID: ");
                    int bookingId = sc.nextInt();

                    manager.cancelTicket(bookingId);
                    break;

                case 4:
                    manager.viewBookings();
                    break;

                case 5:
                    System.out.println("Thank you for using Flight Booking System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}