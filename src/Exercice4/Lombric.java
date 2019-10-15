package Exercice4;
import java.util.ArrayList;

public class Lombric {

    private int longueur;
    public static ArrayList<Lombric> listeLombrics = null;

    // Constructeur sans paramètres
    public Lombric(){
        this.longueur = 1;  //à sa naissance, le lombric mesure 1 cm
        ArrayList<Lombric> listeLombrics = new ArrayList<Lombric>();
    }


    public Lombric(int longueur){
        this.longueur = longueur;
        ArrayList<Lombric> listeLombrics = new ArrayList<Lombric>();
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
    private void grandit(int n){
        this.longueur += n;
    }
    /*Pour que cette méthode ne puisse plus être utilisée pour faire grandir un seul lombric indépendamment des autres,
    on la met en private*/


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


    /**
     * @param n le nombre de cm avec lequel il faut faire grandir tous les lombrics en même temps
     */
    public static void grandissons(int n){
        for(Lombric l : listeLombrics){
            l.grandit(n);
        }
    }
}
