package Exercice8;

public class Rallonge extends ComposantElectrique implements Source{

    private ComposantElectrique rallonge;

    /**
     * @param etatComposant l'état du composant (sous tension / hors tension)
     */
    public void propagation(boolean etatComposant){
        if(etatComposant != getEtatComposant() && rallonge != null){
            /*si la rallonge est sous tension, alors le composant relié l'est aussi, de même si elle est hors tension*/
            setEtatComposant(etatComposant);
            rallonge.propagation(etatComposant);
        }
    }


    public void ajouterElement(ComposantElectrique composant){
        this.rallonge = composant;
    }


    public void retirerElement(ComposantElectrique composant){
        this.rallonge = null;
    }
}

