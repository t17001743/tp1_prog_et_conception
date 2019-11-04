package Exercice9;

public class AgregatHorizontal extends Agregat {

    public AgregatHorizontal(ZoneRectangulaire z1, ZoneRectangulaire z2) {
        this.hauteur = Math.max(z1.getHauteur(), z2.getHauteur());
        this.largeur = z1.getLargeur() + z2.getLargeur();
    }

    public void affiche(){
        System.out.println("");
    }

}
