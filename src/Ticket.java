public class Ticket {
    private int ticketId;
    private String passengerName;
    private String destination;
    private static String airline = "Unicorn airline";
    public Ticket(){}
    public Ticket (int ticketId){
        this.ticketId = ticketId;
    }
    public Ticket (int ticketId,String passenger){
        this.ticketId = ticketId;
        passengerName = passenger;
    }

    public static String getAirline() {
        return airline;
    }
    public static void setAirline(String airline){

    }

    public int getTicketId(){
        return  ticketId;
    }
    public void setTicketId(int id){
        this.ticketId=id;
    }

    public String getPassengerName() {
        return passengerName;
    }
}
