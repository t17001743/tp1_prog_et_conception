/* TP1 Programmation et Conception (17/09/19) THIEL Samantha L3 Informatique*/

import Exercice7.Segment;
import Exercice7.SegmentDiscontinu;
import Exercice7.SegmentPlein;
import Exercice7.SegmentVide;

public class Main {
    public static void main(String[] args) {

        /*------------------------------------------------------Exercice 2------------------------------------------------------*/

        /*Exercice2.ComplexeA z0 = new Exercice2.ComplexeA();
        Exercice2.ComplexeA z1 = new Exercice2.ComplexeA(2, 3);
        Exercice2.ComplexeA z2 = z0.instanceTrigo(5, 0.5);

        System.out.println("\n");
        System.out.println("5e^(i0.5) est sous forme exponentielle. Il s'agit de "+ z2 + " en forme algébrique.");
        System.out.println("\n");

        // addition de z1 et z2
        Exercice2.ComplexeA addition = z0.plus(z1, z2);
        System.out.println(z1 + " + " + z2 + " = " + addition.toString());

        System.out.println("\n");

        // multiplication de z1 et z2
        Exercice2.ComplexeA multiplication = z0.fois(z1, z2);
        System.out.println(z1 + " * " + z2 + " = " + multiplication.toStringTrigo());*/


        /*------------------------------------------------------Exercice 3------------------------------------------------------*/

        /*Variable v = new Variable(true);
        ExpressionBooleenne e = new ExpressionBinaire(new Non(v), new OperateurOu(), Constante.FAUX);
        System.out.println("\n");
        e.affiche();
        System.out.println();     //affiche (NON(VRAI) OU FAUX)
        System.out.println(e.evalue());   //affiche : false
        v.setValeur(false);
        System.out.println(e.evalue());   //affiche : true*/


        /*------------------------------------------------------Exercice 4------------------------------------------------------*/

        /*LombricSain a = new LombricSain();
        a.setLongueur(12);  //a est un lombric adulte
        System.out.println("\n");
        System.out.println("Le lombric a fait " + a.getLongueur() + "cm.");
        Lombric b = new Lombric(11);   //b est aussi un lombric adulte
        System.out.println("Le lombric b fait " + b.getLongueur() + "cm.");
        Lombric c = a.accouplement(b, false);
        System.out.println("\n");
        if(a.getLongueur() >= 10) {
            if (c == null) System.out.println("Accouplement impossible.");
            else System.out.println("Création d'un nouveau lombric.");
        }
        System.out.println("\n");

        ArrayList<Lombric> listeLombrics = new ArrayList<Lombric>();
        listeLombrics.add(a);
        listeLombrics.add(b);
        Lombric.grandissons(10);
        System.out.println("Agrandissement des lombrics :");
        System.out.println("Le lombric a fait maintenant " + listeLombrics.get(a.getLongueur()) + "cm.");
        System.out.println("Le lombric b fait maintenant " + listeLombrics.get(b.getLongueur()) + "cm.");*/


        /*------------------------------------------------------Exercice 5------------------------------------------------------*/

        /*Date.setMaintenant(new Date(1002131548));
        Date.setMaintenant(Date.getMaintenant().plus(Duree.MOIS));

        System.out.println("\n");
        TicketSimple ticketSimple = new TicketSimple(HEURE, 2);
        System.out.println(ticketSimple.toString());*/


        /*------------------------------------------------------Exercice 6------------------------------------------------------*/

        /*GrosMachin oung = new GrosMachin();
        PetitBidule pfuit = new PetitBidule();
        pfuit.bipbip();  //fait bipbip
        oung.glouglou();  //fait glouglou
        pfuit.bipbip();  //fait glouglou !
        pfuit.bipbip();  //fait bipbip*/


        /*------------------------------------------------------Exercice 7------------------------------------------------------*/

        SegmentVide vide = new SegmentVide();
        SegmentPlein plein = new SegmentPlein();
        SegmentDiscontinu s = new SegmentDiscontinu(plein, new SegmentDiscontinu(new SegmentDiscontinu(plein, vide), plein));
        System.out.println(s.remplissage());
        Segment s2 = s.simplification();

    }
}
