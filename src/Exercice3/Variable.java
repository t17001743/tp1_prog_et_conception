package Exercice3;

import Exercice3.ExpressionBooleenne;

public class Variable implements ExpressionBooleenne {

    private boolean variableBool;

    public Variable(){
        // constructeur par défaut
        variableBool = false;
    }

    public Variable(boolean variableBool){
        this.variableBool = variableBool;
    }


    @Override
    public boolean evalue(){
        return this.variableBool;
    }


    @Override
    public void affiche(){
        if(variableBool) System.out.print("VRAI");
        else System.out.print("FAUX");
    }


    public void setValeur(boolean variableBool){
        this.variableBool = variableBool;
    }
}
