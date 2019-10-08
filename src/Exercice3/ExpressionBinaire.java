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
        //en fonction de la table de vérité de l'opérateur "ET"
        return operateur.applique(exp1.evalue(), exp2.evalue());
    }

    @Override
    public void affiche() {
        System.out.print("(");
        exp1.affiche();
        System.out.print(" ");
        System.out.print(operateur.getName());
        System.out.print(" ");
        exp2.affiche();
        System.out.println(")" );
    }
}
