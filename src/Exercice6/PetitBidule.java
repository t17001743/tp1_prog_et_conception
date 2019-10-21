package Exercice6;

import static Exercice6.GrosMachin.variable;

public class PetitBidule extends Bidule{

    public PetitBidule() {
        super();
    }

    public void bipbip(){
        if(variable) System.out.println("Glouglou");
        else super.bipbip();
        variable = false;
    }
}
