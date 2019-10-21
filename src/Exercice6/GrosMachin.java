package Exercice6;

public class GrosMachin extends Machin{

    public static boolean variable = false;

    public GrosMachin() {
        super();
    }

    public void glouglou(){
        super.glouglou();
        variable = true;
    }
}
