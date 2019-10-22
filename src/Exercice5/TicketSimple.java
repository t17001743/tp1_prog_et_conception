package Exercice5;

public class TicketSimple {

    private int dureeValidite;   //durée de validité du ticket après validation
    private float prixTicket;
    private Date dateLimiteValidite;


    public TicketSimple(int dureeValidite, float prixTicket) {
        this.dureeValidite = dureeValidite;
        this.prixTicket = prixTicket;
        this.dateLimiteValidite = null;
    }


    /**
     * @return le prix du ticket
     */
    public float prix(){
        return this.prixTicket;
    }


    /**
     * @return vrai si le ticket est valide, faux sinon
     */
    public boolean valide(){
        if(dateLimiteValidite == null){
            dateLimiteValidite = Date.getMaintenant().plus(dureeValidite);
            return true;
        }
        return Date.getMaintenant().avant(dateLimiteValidite);
    }


    public String toString(){
        return "Création d'un ticket simple valable pour une durée de " + this.dureeValidite + " et coûtant " + this.prixTicket + " euros.";
    }
}
