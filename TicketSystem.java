class Ticket {
    private String ticketNumber;
    private double price;

    public Ticket(String ticketNumber, double price) {
        this.ticketNumber = ticketNumber;
        this.price = price;
    }

    public String getTicketNumber() { return ticketNumber; }
    public double getPrice() { return price; }

    public void generateTicket() {
        System.out.println("Base Ticket reference ID: " + ticketNumber + " | Base cost: $" + price);
    }
}

class BusTicket extends Ticket {
    private String seatNumber;

    public BusTicket(String ticketNumber, double price, String seatNumber) {
        super(ticketNumber, price);
        this.seatNumber = seatNumber;
    }

    @Override
    public void generateTicket() {
        System.out.println("[BUS TICKET] Ref: " + getTicketNumber() + " | Seat: " + seatNumber + " | Final Fare: $" + getPrice());
    }
}

class TrainTicket extends Ticket {
    private String coachType;

    public TrainTicket(String ticketNumber, double price, String coachType) {
        super(ticketNumber, price);
        this.coachType = coachType;
    }

    @Override
    public void generateTicket() {
        System.out.println("[TRAIN TICKET] Ref: " + getTicketNumber() + " | Car/Coach Class: " + coachType + " | Final Fare: $" + getPrice());
    }
}

class FlightTicket extends Ticket {
    private String boardingGate;

    public FlightTicket(String ticketNumber, double price, String boardingGate) {
        super(ticketNumber, price);
        this.boardingGate = boardingGate;
    }

    @Override
    public void generateTicket() {
        System.out.println("[BOARDING PASS] Flight Ref: " + getTicketNumber() + " | Proceed to Gate: " + boardingGate + " | Final Fare: $" + getPrice());
    }
}

public class TicketSystem {
    public static void main(String[] args) {
        Ticket[] transitTickets = {
            new BusTicket("BUS-77A", 15.50, "12B"),
            new TrainTicket("TRN-902", 45.00, "Sleeper First Class"),
            new FlightTicket("FL-AA34", 320.00, "Gate G14")
        };

        for (Ticket t : transitTickets) {
            t.generateTicket();
        }
    }
}
