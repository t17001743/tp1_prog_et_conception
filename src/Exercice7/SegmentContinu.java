package Exercice7;

public abstract class SegmentContinu implements Segment{

    @Override
    public abstract float remplissage();

    @Override
    public Segment simplification() {
        return this;
    }
}
