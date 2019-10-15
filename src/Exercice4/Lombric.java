package Exercice4;

public class Lombric {

    private int longueur;
    /*Pour faire grandir tous les lombrics existants en même temps, on les stocke dans un tableau de Lombric*/

    // Constructeur sans paramètres
    public Lombric(){
        this.longueur = 1;  //à sa naissance, le lombric mesure 1 cm
    }


    public Lombric(int longueur){
        this.longueur = longueur;
    }


    /**
     * @return la longueur du lombric
     */
    public int getLongueur(){
        return this.longueur;
    }

    /**
     * @param longueur la longueur
     */
    public void setLongueur(int longueur){
        this.longueur = longueur;
    }


    /**
     * @param n ajoute n centimètres à la longueur du lombric
     */
    public void grandit(int n){
        this.longueur += n;
    }
    /*Pour que cette méthode ne puisse plus être utilisée pour faire grandir un seul lombric indépendamment des autres,
    on fait une boucle for sur le tableau et on augmente la longueur de chaque lombric de n cm.*/


    /**
     * @param b le lombric avec lequel s'accoupler
     * @return un nouveau lombric
     */
    public Lombric accouplement(Lombric b){
        if(b.getLongueur() >= 10) return new Lombric();
        return null;
    }


    /**
     * @return une des deux moitiés du lombric
     */
    public Lombric coupe(){
        return new Lombric(getLongueur()/2);
    }


    public void grandissons(int n){
        grandit(n);
    }
}
