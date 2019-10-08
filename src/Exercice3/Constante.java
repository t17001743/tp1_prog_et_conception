package Exercice3;

public class Constante extends Variable {

    private Constante VRAI, FAUX;

    public Constante(){
        super();
    }

    public Constante(Constante vrai, Constante faux){
        this.VRAI = vrai;
        this.FAUX = faux;
    }
}
