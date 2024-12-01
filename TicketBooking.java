class MovieTicket{
    private int movieId;
    private int noOfSeats;
    private double costPerTicket;

    public MovieTicket(int movieId , int noOfSeats)
    {
        this.movieId = movieId;
        this.noOfSeats = noOfSeats;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public double getCostPerTicket() {
        return costPerTicket;
    }

    public void setCostPerTicket(double costPerTicket) {
        this.costPerTicket = costPerTicket;
    }

    public double calculateTotalAmount(){
        if (movieId == 111)
        {
            costPerTicket = 7;
            double amount = costPerTicket * noOfSeats ;
            return (Math.round(amount));

        } else if (movieId == 112) {
            costPerTicket= 8;
            double amount = costPerTicket * noOfSeats ;
            return (Math.round(amount));
        }
        else if (movieId == 113) {
            costPerTicket= 8.5;
            double amount = costPerTicket * noOfSeats ;
            return (Math.round(amount));
        }

        return 0;
    }

}

public class TicketBooking {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket(112, 3);
        double amount = movieTicket.calculateTotalAmount();
        if (amount==0)
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking : $" + amount);
    }
}
