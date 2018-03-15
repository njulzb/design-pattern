package facade;

public class Airport {
    public void bookTicket(String from ,String to ){
        String format = "book a ticket from %s to %s";
        System.out.println(String.format(format,from,to));
    }
}
