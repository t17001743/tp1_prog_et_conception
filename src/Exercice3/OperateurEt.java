package Exercice3;

public class OperateurEt implements OperateurBinaire {

    public OperateurEt() {
    }

    @Override
    public boolean applique(boolean e1, boolean e2) {
        return (e1 && e2);
    }

    @Override
    public String getName() {
        return "ET";
    }
}
