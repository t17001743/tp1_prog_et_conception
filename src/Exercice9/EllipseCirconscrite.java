package Exercice9;

public class EllipseCirconscrite extends RectangleSimple {

    public EllipseCirconscrite() {
    }

    public EllipseCirconscrite(int hauteur, int largeur) {
        super(hauteur, largeur);
    }

    public void affiche(){
        System.out.println("Ellipse " + this.hauteur + ":" + this.largeur + "en (" + this.x + "," + this.y + ").");
    }

}
