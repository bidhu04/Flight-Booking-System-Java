import java.util.ArrayList;

public class FlightManager {

    private ArrayList<Flight> flights = new ArrayList<>();
    private ArrayList<Booking> bookings = new ArrayList<>();
    private int bookingCounter = 1001;

    public FlightManager() {

        flights.add(new Flight(1, "IndiGo", "Chennai", "Bangalore", 50));
        flights.add(new Flight(2, "Air India", "Coimbatore", "Delhi", 40));
        flights.add(new Flight(3, "Vistara", "Mumbai", "Kolkata", 35));
        flights.add(new Flight(4, "Akasa Air", "Hyderabad", "Goa", 25));
    }

    public void viewFlights() {

        System.out.println("\nAvailable Flights");
        System.out.println("----------------------------------");

        for (Flight flight : flights) {
            flight.displayFlight();
        }
    }

    public void bookTicket(int flightId, String passengerName) {

        for (Flight flight : flights) {

            if (flight.getFlightId() == flightId) {

                if (flight.getAvailableSeats() > 0) {

                    Passenger passenger = new Passenger(passengerName);

                    Booking booking = new Booking(
                            bookingCounter++,
                            flight,
                            passenger);

                    bookings.add(booking);

                    flight.bookSeat();

                    System.out.println("\n✅ Ticket Booked Successfully!");
                    System.out.println("Booking ID: " + booking.getBookingId());

                } else {
                    System.out.println("\n❌ No Seats Available!");
                }

                return;
            }
        }

        System.out.println("\n❌ Flight Not Found!");
    }

    public void cancelTicket(int bookingId) {

        for (int i = 0; i < bookings.size(); i++) {

            Booking booking = bookings.get(i);

            if (booking.getBookingId() == bookingId) {

                booking.getFlight().cancelSeat();

                bookings.remove(i);

                System.out.println("\n✅ Ticket Cancelled Successfully!");
                return;
            }
        }

        System.out.println("\n❌ Booking ID Not Found!");
    }

    public void viewBookings() {

        if (bookings.isEmpty()) {

            System.out.println("\nNo Bookings Available!");
            return;
        }

        System.out.println("\nBooking Details");
        System.out.println("----------------------------------");

        for (Booking booking : bookings) {
            booking.displayBooking();
        }
    }
}