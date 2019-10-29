package Exercice8;

public abstract class ComposantElectrique {

    private boolean etatComposant;
    private Source source;

    /**
     * @param etatComposant l'état du composant (sous tension / hors tension)
     */
    public abstract void propage(boolean etatComposant);


    /**
     * @return vrai si le composant est sous tension, faux sinon
     */
    public boolean getEtatComposant(){
        return etatComposant;
    }


    public void setEtatComposant(boolean b){
        etatComposant = b;
    }


    /**
     * Le composant électrique branche son unique entrée (prise mâle) sur une prise murale (femelle)
     */
    public void brancheSurPriseMurale(){
        propage(true);
    }


    /**
     * @param source
     * @return
     */
    public boolean brancheSur(Source source)
    {
        if(this.source == null && !etatComposant)
        {
            this.source = source;
            source.ajouteElement(this);
            propage(((ComposantElectrique) this.source).getEtatComposant());
            return true;
        }
        else
            return false;
    }

    public void debranche()
    {
        if(source != null)
            source.retireElement(this);
        source = null;
        propage(false);
    }
}
