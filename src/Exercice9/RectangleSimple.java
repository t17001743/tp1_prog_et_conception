package Exercice9;

public abstract class RectangleSimple extends ZoneRectangulaire {

    /**
     * Constructeur par défaut
     */
    public RectangleSimple(){
    }

    /**
     * @param hauteur la hauteur du rectangle simple
     * @param largeur la largeur du rectangle simple
     */
    public RectangleSimple(int hauteur, int largeur) {
        this.hauteur = hauteur;
        this.largeur = largeur;
    }

    @Override
    public void affiche() {
        System.out.println("Rectangle " + this.largeur + "x" + this.hauteur);
    }
}
