package Exercice8;

public class PriseMultiple extends ComposantElectrique implements Source{

    private ComposantElectrique[] tableauPrises;  //la prise multiple est représentée par un tableau de prises (qui sont des composants électriques)

    public PriseMultiple(int nbPrises){
        this.tableauPrises = new ComposantElectrique[nbPrises];  //création d'une prise multiple avec autant de prises que l'on veut
    }


    /**
     * @param etatComposant l'état du composant (sous tension / hors tension)
     */
    public void propagation(boolean etatComposant){
        if(etatComposant != getEtatComposant()){
            setEtatComposant(etatComposant);
            for(int i=0; i < tableauPrises.length; i++){  //parcours de toutes les prises de la prise multiple
                if(tableauPrises[i] != null) tableauPrises[i].propagation(etatComposant);
            }
        }
    }


    public void ajouterElement(ComposantElectrique composant){
        int i = 0;
        while(i < tableauPrises.length && tableauPrises[i] != null){
            i++;
        }
        //quand on trouve une case du tableau vide, on la remplit avec le composant passé en paramètres
        tableauPrises[i] = composant;
    }


    public void retirerElement(ComposantElectrique composant){
        int i = 0;
        while(i < tableauPrises.length && tableauPrises[i] != composant){
            i++;
        }
        //quand on trouve le composant passé en paramètres dans le tableau, on le supprime en mettant sa case correspondante à vide
        tableauPrises[i] = null;
    }
}
