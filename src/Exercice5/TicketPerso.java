package Exercice5;

public class TicketPerso {

    private int recharge ;
    private TicketSimple abonnement;

    public TicketPerso(){
        this.recharge = 0;    //initialise la recharge à 0 voyage
    }


    /**
     * @param duree la durée de l'abonnement
     * @param prix le prix de l'abonnement
     * @return faux si l'abonnement ne se fait pas (car toujours valide), vrai sinon
     */
    public boolean abonnement(int duree, float prix){
        if(abonnement == null){
            abonnement(duree, prix);
            return true;
        }
        return false;
    }


    /**
     * @return vrai si l'abonnement courant est toujours valide, faux sinon
     */
    public boolean valide(){
        if(abonnement != null){   //si l'abonnement courant existe
            return abonnement.valide();
        }
        return false;
    }
}
