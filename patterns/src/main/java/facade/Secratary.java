package facade;

public class Secratary {
    private Hotel hotel = new Hotel();
    private Airport airport = new Airport();

    public void trip(String from, String to , int days){
        this.airport.bookTicket(from,to);
        this.hotel.reserve(days);
    }

}
