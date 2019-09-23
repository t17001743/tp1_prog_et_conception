/* TP1 Programmation et Conception (17/09/19) */

public class Main {
    public static void main(String[] args) {

        /*------------------------------------------------------Exercice 2------------------------------------------------------*/

        Complexe z0 = new Complexe();
        Complexe z1 = new Complexe(2, 3);
        Complexe z2 = z0.instanceTrigo(5, 0.5);

        System.out.println("5e^(i0.5) est en forme exponentielle. Il s'agit de "+ z2 + " en forme algébrique.");

        System.out.println("\n");

        // addition de z1 et z2
        Complexe addition = z0.plus(z1, z2);
        System.out.println(z1 + " + " + z2 + " = " + addition.toString());

        System.out.println("\n");

        // multiplication de z1 et z2
        Complexe multiplication = z0.fois(z1, z2);
        System.out.println(z1 + " * " + z2 + " = " + multiplication.toStringTrigo());

        /*----------------------------------------------------------------------------------------------------------------------*/
    }
}
