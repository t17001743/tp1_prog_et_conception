package Exercice8;

public interface Source{

    /**
     * @param composant le composant électrique qu'on ajoute aux sources électriques
     */
    void ajouterElement(ComposantElectrique composant);

    /**
     * @param composant le composant électrique qu'on retire des sources électriques
     */
    void retirerElement(ComposantElectrique composant);
}
