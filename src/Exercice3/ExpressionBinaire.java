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
        if(operateur.getName().equals("ET")) {
            if (operateur.applique(true, true)) return true;
            return false;
        }
        if(operateur.getName().equals("OU")){
            if(operateur.applique(false, true) || operateur.applique(true, false) || operateur.applique(true, true)) return true;
            return false;
        }
        return false;
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
