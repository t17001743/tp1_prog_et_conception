public class Compteur {

    private int chiffre;
    private Compteur suivant;


    /**
     * Constructeur qui initialise le compteur à 0
     */
    public Compteur() {
        this.suivant = null;
    }


    /**
     * Constructeur qui initialise le compteur avec l'entier passé en paramètre
     */
    public Compteur(int entier) {
        this.chiffre = entier;
    }


    /**
     * Constructeur de copie
     */
    public Compteur(Compteur c){
        this.suivant = new Compteur(c);
    }


    /**
     * Incrémente le compteur d'une unité
     */
    public void inc(){
        if(this.chiffre <= 9) this.chiffre++;
        else{
            this.chiffre = 0;
            //this.suivant
        }
    }


    /**
     * Décrémente le compteur d'une unité
     */
    public void dec(){
        if(this.chiffre > 0) this.chiffre--;
       /* else{

        }*/
    }


    /**
     * Affiche la valeur du compteur (les chiffres dans le bon ordre)
     */
    public void affiche(){
        while(this.suivant != null){
            System.out.println(this.chiffre);
            this.suivant.dec();
        }
    }


    /**
     * Indique si c et le compteur sur lequel on appelle la méthode ont la même valeur
     */
    public boolean egale(Compteur c){
        if(c.equals(this.suivant)) return true;
        return false;
    }

}
