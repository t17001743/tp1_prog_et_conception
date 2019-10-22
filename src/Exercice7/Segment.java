package Exercice7;

public abstract class Segment {

    private int longueur;

    public Segment() {
    }

    public Segment(int longueur) {
        this.longueur = longueur;
    }

    /**
     * @return le taux de remplissage (un flottant de l'intervalle [0;1] du segment
     */
    public abstract float remplissage();

    /**
     * @return un segment simplifié
     */
    public abstract Segment simplification();


    public int getLongueur() {
        return longueur;
    }


    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }
}
