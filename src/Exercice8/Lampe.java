package Exercice8;

public class Lampe extends ComposantElectrique{

    private String nomComposant;

    public Lampe(String nomComposant){
        this.nomComposant = nomComposant;
    }


    /** Lorsque le composant électrique change d'état => propagation de son état aux composants qu'il a en sortie
     * @param etatComposant l'état du composant (sous tension / hors tension)
     */
    public void propagation(boolean etatComposant){
        if(etatComposant != getEtatComposant()){
            setEtatComposant(etatComposant);
            if(etatComposant) System.out.println(nomComposant + " allumée");  //si le composant est sous tension (etatComposant == true)
            else System.out.println(nomComposant + " éteinte");  //sinon, le composant est forcément hors tension (etatComposant == false)
        }
    }
}
