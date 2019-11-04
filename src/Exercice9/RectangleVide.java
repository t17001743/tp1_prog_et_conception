package Exercice9;

public class RectangleVide extends RectangleSimple {

    private int hauteur, largeur;

    public RectangleVide(int hauteur, int largeur){
        this.hauteur = hauteur;
        this.largeur = largeur;
    }

    public void affiche(){
        System.out.println("");
    }
}
