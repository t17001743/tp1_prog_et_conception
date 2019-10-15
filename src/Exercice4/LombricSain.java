package Exercice4;

public class LombricSain extends Lombric {

    private boolean scission;   //vrai si les deux lombrics sont issus du même lombric par scission, faux sinon

    public LombricSain(){
        super();
        this.scission = false;
    }

    /**
     * @param b le lombric avec lequel s'accoupler
     * @return un nouveau lombric si les deux lombrics sont adultes et s'ils ne sont pas issus du même lombric par scission
     */
    public Lombric accouplement(Lombric b, boolean scission){
        this.scission = scission;
        if(b.getLongueur() >= 10 && !this.scission) return new LombricSain();
        return null;
    }


    public Lombric coupe(){
        return super.coupe();   //changer le retour en LombricSain
    }
}
