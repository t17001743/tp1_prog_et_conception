package Exercice9;

public class RectanglePlein extends RectangleSimple {

    private int hauteur, largeur;

    public RectanglePlein(int hauteur, int largeur){
        this.hauteur = hauteur;
        this.largeur = largeur;
    }

    public void affiche(){
        System.out.println("Rectangle " + this.hauteur + "x" + this.largeur + "en (" + this.x + "," + this.y + ").");
    }
}
