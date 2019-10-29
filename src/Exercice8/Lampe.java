package Exercice8;

public class Lampe extends ComposantElectrique {

    private String nom;

    public Lampe(String s){
        nom = s;
    }

    public void propage(boolean etatComposant){
        System.out.println(this + " a l'etat " + etatComposant);
        if(etatComposant != getEtatComposant())
        {
            setEtatComposant(etatComposant);
            if(etatComposant)
                System.out.println(nom + " allumee");
            else
                System.out.println(nom + " eteinte");
        }
    }
}
