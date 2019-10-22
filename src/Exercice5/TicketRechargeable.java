package Exercice5;

public class TicketRechargeable{

    private int nbVoyages;
    private TicketSolo ticket;

    public TicketRechargeable(int nbVoyages) {
        this.nbVoyages = nbVoyages;
    }


    /**
     * @return le nombre de voyages restants
     */
    public int reste(){
        return this.nbVoyages;
    }


    /**
     * @param n ajoute n voyages au ticket
     */
    public final void recharge(int n){
        this.nbVoyages += n;
    }


    /**
     * @return vrai si le ticket est valide, faux sinon
     */
    public boolean valide(){
        if(!ticket.valide()){   //si ticket invalide
            TicketSolo nouveauTicket = new TicketSolo();  //se recrée
            this.nbVoyages--;   //décrémente le nombre de voyages
            return true;  //se valide
        }
        return false;
    }
}
