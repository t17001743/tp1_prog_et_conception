package Exercice7;

public interface Segment {

    /**
     * @return le taux de remplissage (un flottant de l'intervalle [0;1] du segment
     */
    float remplissage();

    /**
     * @return un segment simplifié
     */
    Segment simplification();
}
