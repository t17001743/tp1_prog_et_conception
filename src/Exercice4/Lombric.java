package Exercice4;

public class Lombric {

    private int longueur;

    // Constructeur sans paramètres
    public Lombric() {
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
     * @param n ajoute n centimètres à la longueur du lombric
     */
    public void grandit(int n){
        this.longueur += n;
    }


    /**
     * @param b le lombric avec lequel s'accoupler
     * @return un nouveau lombric
     */
    public Lombric accouplement(Lombric b){
        if(b.getLongueur() >= 10) return new Lombric();
        return null;
    }


    /**
     * @return une des deux parties égales du lombric
     */
    public Lombric coupe(){
        return new Lombric(getLongueur()/2);
    }
}
