public class Flight {

    private int flightId;
    private String flightName;
    private String source;
    private String destination;
    private int availableSeats;

    public Flight(int flightId, String flightName, String source, String destination, int availableSeats) {
        this.flightId = flightId;
        this.flightName = flightName;
        this.source = source;
        this.destination = destination;
        this.availableSeats = availableSeats;
    }

    public int getFlightId() {
        return flightId;
    }

    public String getFlightName() {
        return flightName;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void bookSeat() {
        if (availableSeats > 0) {
            availableSeats--;
        }
    }

    public void cancelSeat() {
        availableSeats++;
    }

    public void displayFlight() {
        System.out.println(
                flightId + " | " +
                flightName + " | " +
                source + " -> " +
                destination + " | Seats: " +
                availableSeats);
    }
}