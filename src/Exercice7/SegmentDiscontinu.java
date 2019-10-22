package Exercice7;

public class SegmentDiscontinu implements Segment {

    private Segment s1, s2;

    public SegmentDiscontinu(Segment s1, Segment s2) {
        this.s1 = s1;
        this.s2 = s2;
    }


    public float remplissage(){
        return (s1.remplissage() + s2.remplissage())/2;
    }


    public Segment simplification(){
        Segment s1 = this.s1.simplification();
        Segment s2 = this.s2.simplification();
        if(((s1 instanceof SegmentPlein) && (s2 instanceof SegmentPlein)) || ((s1 instanceof SegmentVide) && (s2 instanceof SegmentVide))) return s1;
        return new SegmentDiscontinu(s1,s2);
    }
}
