package Exercice3;

import Exercice3.ExpressionBooleenne;

public class Variable implements ExpressionBooleenne {

    private boolean variableBool;

    public Variable(){
        // constructeur par défaut
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
        System.out.println(variableBool);
    }


    private void setValeur(boolean variableBool){   //on ne peut pas l'utiliser dans la classe Constante qui hérite de Variable car private
        this.variableBool = variableBool;
    }
}
