class Seat {
    private String seatNumber;
    private boolean isBooked;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
        this.isBooked = false;
    }

    public String getSeatNumber() { return seatNumber; }
    public boolean isBooked() { return isBooked; }
    protected void setBooked(boolean booked) { this.isBooked = booked; }

    public void bookSeat() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Seat " + seatNumber + " successfully secured.");
        } else {
            System.out.println("Seat " + seatNumber + " is already occupied.");
        }
    }
}

class RegularSeat extends Seat {
    public RegularSeat(String seatNumber) {
        super(seatNumber);
    }
  
}

class PremiumSeat extends Seat {
    private double luxuryTax;

    public PremiumSeat(String seatNumber, double luxuryTax) {
        super(seatNumber);
        this.luxuryTax = luxuryTax;
    }

    @Override
    public void bookSeat() {
        if (!isBooked()) {
            setBooked(true);
            System.out.println("Premium Seat " + getSeatNumber() + " successfully locked down.");
            System.out.println(" -> Benefits Added: Complementary Lounge Snacks & Beverage service included.");
            System.out.println(" -> Surcharge Applied (Luxury Fee): $" + luxuryTax);
        } else {
            System.out.println("Premium Seat " + getSeatNumber() + " is already occupied.");
        }
    }
}

public class TheaterBooking {
    public static void main(String[] args) {
        Seat rowA = new RegularSeat("A-12");
        Seat boxVIP = new PremiumSeat("VIP-Box 1", 15.00);

        rowA.bookSeat();
        boxVIP.bookSeat();
    }
}
