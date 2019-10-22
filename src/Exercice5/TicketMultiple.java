package Exercice5;

public class TicketMultiple{

    private TicketRechargeable ticketRechargeable;

    public TicketMultiple(int nbVoyages) {
        ticketRechargeable = new TicketRechargeable(nbVoyages);
    }


    public int reste(){
        return ticketRechargeable.reste();
    }


    public boolean valide(){
        return ticketRechargeable.valide();
    }
}
