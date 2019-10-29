package Exercice8;

public class Rallonge extends ComposantElectrique implements Source{

    private ComposantElectrique destination;

    public void propage(boolean etatComposant)
    {
        System.out.println(this + " a l'etat " + etatComposant);
        if(etatComposant != getEtatComposant() && destination != null)
        {
            setEtatComposant(etatComposant);
            System.out.println("propage a " + destination);
            destination.propage(etatComposant);
        }
    }

    public void ajouteElement(ComposantElectrique e)
    {
        destination = e;
    }

    public void retireElement(ComposantElectrique e)
    {
        destination = null;
    }
}
