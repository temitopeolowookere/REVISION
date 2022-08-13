import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketTest {
     private Ticket bankeTicket;
     private Ticket temmyTicket;
     private Ticket jamesTicket;
     @BeforeEach

    public void setup(){
         bankeTicket = new Ticket();
         bankeTicket.setTicketId(1);
     }
    @Test
    public void getTicketId(){
         assertEquals(1, bankeTicket.getTicketId());
    }
    @Test
    public void createTicketWithParameters(){
         jamesTicket = new Ticket(2);
        assertEquals(2, jamesTicket.getTicketId());
    }

    @Test
    public void createTicketWithPassengerName(){
         temmyTicket = new Ticket(3,"temi escorter");
         assertEquals(3,temmyTicket.getTicketId());
         assertEquals("temi escorter",temmyTicket.getPassengerName());
    }

    @Test
    void getAirlineName(){
         assertEquals("Unicorn airline",Ticket.getAirline());
         Ticket.setAirline("Unicorn airline");
         assertEquals("Unicorn airline",Ticket.getAirline());
    }


}
