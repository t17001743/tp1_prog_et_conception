package Exercice5;

import static Exercice5.Duree.HEURE;

public class TicketSolo extends TicketSimple{

    public TicketSolo() {
        super(HEURE, 1.5F);  //valable 1 heure, vaut 1.5 euros
    }
}
