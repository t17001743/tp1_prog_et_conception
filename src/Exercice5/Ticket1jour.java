package Exercice5;

import static Exercice5.Duree.JOUR;

public class Ticket1jour extends TicketSimple {

    public Ticket1jour() {
        super(JOUR, 5);   //valable 1 jour, vaut 5 euros
    }
}
