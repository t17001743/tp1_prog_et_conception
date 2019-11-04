package Exercice9;

public abstract class Agregat extends ZoneRectangulaire {

    private ZoneRectangulaire z1, z2;

    public Agregat() {
    }

    public Agregat(ZoneRectangulaire z1, ZoneRectangulaire z2) {
        this.z1 = z1;
        this.z2 = z2;
    }

    @Override
    public void affiche() {
        z1.affiche();
        z2.affiche();
    }
}
