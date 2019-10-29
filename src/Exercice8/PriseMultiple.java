package Exercice8;

public class PriseMultiple extends ComposantElectrique implements Source{

    private ComposantElectrique [] destinations;

    public PriseMultiple(int n)
    {
        destinations = new ComposantElectrique[n];
    }

    public void propage(boolean etatComposant)
    {
        int i;
        System.out.println(this + " a l'etat " + etatComposant);
        if(etatComposant != getEtatComposant())
        {
            setEtatComposant(etatComposant);
            for(i = 0; i < destinations.length; i = i + 1)
                if(destinations[i] != null)
                {System.out.println("propage a " + destinations[i]);
                    destinations[i].propage(etatComposant);}
        }
    }

    public void ajouteElement(ComposantElectrique e)
    {
        int i = 0;

        while(i < destinations.length && destinations[i] != null)
            i = i + 1;
        destinations[i] = e;
    }

    public void retireElement(ComposantElectrique e)
    {
        int i = 0;

        while(i < destinations.length && destinations[i] != e)
            i = i + 1;
        destinations[i] = null;
    }
}
