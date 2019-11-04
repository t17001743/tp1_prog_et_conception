package Exercice9;

public class AgregatVertical extends Agregat {

    public AgregatVertical(ZoneRectangulaire z1, ZoneRectangulaire z2){
        this.largeur = Math.max(z1.getLargeur(), z2.getLargeur());
        this.hauteur = z1.getHauteur() + z2.getHauteur();
    }

    public void affiche(){
        System.out.println("");
    }

}
