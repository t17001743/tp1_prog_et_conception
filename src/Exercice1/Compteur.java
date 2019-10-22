package Exercice1;
/* Exercice 1 */

public class Compteur {

    private int chiffre;
    private Compteur suivant;


    /**
     * Constructeur qui initialise le compteur à 0
     */
    public Compteur() {
        this.chiffre = 0;
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
        this.chiffre = c.chiffre;
    }


    /**
     * Incrémente le compteur d'une unité
     */
    public void inc(){
        this.chiffre++;
        if(this.chiffre > 9){
            this.chiffre = 0;
            this.suivant.inc(); //récursivité
        }
    }


    /**
     * Décrémente le compteur d'une unité
     */
    public void dec(){
        if(this.chiffre == 0){      //si l'unité du compteur est égale à 0
            if(this.suivant == null) System.out.println ("Décrémentation impossible : compteur à 0.");       //si le compteur est à zéro (aucun autre chaînon)
            this.chiffre = 9;   //sinon l'unité est maintenant égale à 9
            this.suivant = null;  //et le dernier chaînon est supprimé
            dec();   //récursivité
        }
        this.chiffre--;   // à mettre en haut, même principe que inc
    }


    /**
     * Affiche la valeur du compteur (les chiffres dans le bon ordre)
     */
    public void affiche(){
        System.out.print(this.chiffre);
    }


    /**
     * Indique si c et le compteur sur lequel on appelle la méthode ont la même valeur
     */
    public boolean egale(Compteur c){
        if(c.chiffre == this.chiffre) return true;
        return false;
    }

}
