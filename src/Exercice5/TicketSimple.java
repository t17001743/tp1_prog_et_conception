package Exercice5;

public class TicketSimple {

    private int dureeValidite;
    private float prixTicket;


    public TicketSimple(int dureeValidite, float prixTicket) {
        this.dureeValidite = dureeValidite;
        this.prixTicket = prixTicket;
    }


    public float prix(){
        return this.prixTicket;
    }


    public boolean valide(){

    }
}
