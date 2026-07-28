public class Booking {

    private int bookingId;
    private Flight flight;
    private Passenger passenger;

    public Booking(int bookingId, Flight flight, Passenger passenger) {
        this.bookingId = bookingId;
        this.flight = flight;
        this.passenger = passenger;
    }

    public int getBookingId() {
        return bookingId;
    }

    public Flight getFlight() {
        return flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void displayBooking() {
        System.out.println("\nBooking ID : " + bookingId);
        System.out.println("Passenger  : " + passenger.getPassengerName());
        System.out.println("Flight     : " + flight.getFlightName());
        System.out.println("Route      : " + flight.getSource() + " -> " + flight.getDestination());
    }
}