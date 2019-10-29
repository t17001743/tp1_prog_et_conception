package Exercice8;

public abstract class ComposantElectrique{

    private boolean etatComposant;
    private Source source;

    /**
     * @param etatComposant l'état du composant (sous tension / hors tension)
     */
    public abstract void propagation(boolean etatComposant);


    /**
     * @return vrai si le composant est sous tension, faux sinon
     */
    public boolean getEtatComposant(){
        return etatComposant;
    }


    public void setEtatComposant(boolean etatComposant){
        this.etatComposant = etatComposant;
    }


    /**
     * Le composant électrique branche son unique entrée (prise mâle) sur une prise murale (femelle)
     */
    public void brancheSurPriseMurale(){
        propagation(true);
    }


    /**
     * @param source la source électrique sur laquelle on branche le composant
     * @return
     */
    public boolean brancheSur(Source source){
        if(this.source == null && !etatComposant){  //on vérifie que le composant n'est pas déjà branché sur une source
            this.source = source;
            source.ajouterElement(this);
            propagation(((ComposantElectrique) this.source).getEtatComposant());
            return true;
        }
        return false;
    }


    /**
     * Débranche le composant de sa source électrique
     */
    public void debranche(){
        if(this.source != null)
            this.source.retirerElement(this);
        this.source = null;
        propagation(false);
    }
}
