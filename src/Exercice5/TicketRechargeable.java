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
    public void recharge(int n){
        this.nbVoyages += n;
    }


    /**
     * @return vrai si le ticket est valide, faux sinon
     */
    public boolean valide(){
        if(!ticket.valide() && nbVoyages != 0){   //si ticket invalide
            ticket = new TicketSolo();  //se recrée
            this.nbVoyages--;   //décrémente le nombre de voyages
            ticket.valide();
            return true;  //se valide
        }
        return ticket.valide();
    }
}
