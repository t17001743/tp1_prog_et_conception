package Exercice3;

public class ExpressionBinaire implements ExpressionBooleenne {

    private ExpressionBooleenne exp1, exp2;
    private OperateurBinaire operateur;

    public ExpressionBinaire(ExpressionBooleenne exp1, OperateurBinaire operateur, ExpressionBooleenne exp2) {
        this.exp1 = exp1;
        this.operateur = operateur;
        this.exp2 = exp2;
    }

    @Override
    public boolean evalue() {
        return false;
    }

    @Override
    public void affiche() {
        System.out.println("(" + exp1 + operateur + exp2 + ")" );
    }
}
