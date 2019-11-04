package Exercice9;

public abstract class ZoneRectangulaire {

    protected int x, y, hauteur, largeur;

    /**
     * Constructeur par défaut
     */
    public ZoneRectangulaire() {
        this.x = 0;
        this.y = 0;
        this.hauteur = 0;
        this.largeur = 0;
    }

    /** Constructeur paramétré
     * @param x l'abscisse
     * @param y l'ordonnée
     * @param hauteur la hauteur de la zone
     * @param largeur la largeur de la zone
     */
    public ZoneRectangulaire(int x, int y, int hauteur, int largeur) {
        this.x = x;
        this.y = y;
        this.hauteur = hauteur;
        this.largeur = largeur;
    }


    /**
     * @return l'abscisse du point
     */
    public int getX(){
        return this.x;
    }


    /**
     * @param x la nouvelle valeur de l'abscisse
     */
    public void setX(int x){
        this.x = x;
    }


    /**
     * @return l'ordonnée du point
     */
    public int getY(){
        return this.y;
    }


    /**
     * @param y la nouvelle valeur de l'ordonnée
     */
    public void setY(int y){
        this.y = y;
    }


    /**
     * @return la largeur de la zone rectangulaire
     */
    public int getLargeur(){
        return this.largeur;
    }


    /**
     * @return la hauteur de la zone rectangulaire
     */
    public int getHauteur(){
        return this.hauteur;
    }


    /**
     * Affichage de la zone rectangulaire
     */
    public abstract void affiche();

}
