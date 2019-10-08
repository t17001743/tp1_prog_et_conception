package Exercice3;

public class Non implements ExpressionBooleenne{

    private ExpressionBooleenne exp;

    public Non(ExpressionBooleenne exp){
        this.exp = exp;
    }


    @Override
    public boolean evalue(){
        return(!exp.evalue());
    }


    @Override
    public void affiche(){
        System.out.print("NON(");
        exp.affiche();
        System.out.print(")");
    }
}
