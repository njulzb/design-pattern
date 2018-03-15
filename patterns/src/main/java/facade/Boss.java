package facade;

public class Boss {
    private Secratary secratary = new Secratary();

    public void business(String from, String to , int days){
        this.secratary.trip(from, to, days);
    }

}
