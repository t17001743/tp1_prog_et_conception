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
        if(exp.evalue()) System.out.println(exp);
        System.out.println("NON(" + exp + ")");
    }
}
