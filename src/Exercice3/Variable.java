package Exercice3;

import Exercice3.ExpressionBooleenne;

public class Variable implements ExpressionBooleenne {

    private boolean variableBool;

    public Variable(boolean variableBool){
        this.variableBool = variableBool;
    }


    public boolean evalue(){

    }


    public void affiche(){

    }


    void setValeur(boolean variableBool){
        this.variableBool = variableBool;
    }
}
