package Exercice5;

public class Date {

    private int date;
    private static Date dateActuelle;

    public Date(int date) {
        this.date = date;
    }


    /**
     * @param duree la durée à ajouter à la date
     * @return la date qu'il serait si on attendait la durée duree à partir de la date sur laquelle on appelle la méthode
     */
    public Date plus(int duree){
        return new Date(this.date + duree);
    }


    /**
     * @param d une date
     * @return vrai si la date sur laquelle on appelle la méthode est située avant d dans le temps, faux sinon
     */
    public boolean avant(Date d){
        if(this.date < d.date) return true;
        return false;
    }


    /**
     * @param d la date dont on se sert pour modifier dateActuelle
     */
    public static void setMaintenant(Date d){
        dateActuelle = d;
    }


    /**
     * @return l'attribut de classe statique dateActuelle
     */
    public static Date getMaintenant(){
        return dateActuelle;
    }


}
