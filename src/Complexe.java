public interface Complexe {

    /**
     * @return la partie réelle x du nombre complexe
     */
    public double getX();


    /**
     * @param x modifier la partie réelle x du nombre complexe
     */
    public void setX(double x);


    /**
     * @return la partie imaginaire y du nombre complexe
     */
    public double getY();


    /**
     * @param y modifier la partie imaginaire y du nombre complexe
     */
    public void setY(double y);


    /**
     * @return la valeur de rho du nombre complexe
     */
    public double getRho();


    /**
     * @param rho modifier la valeur de rho du nombre complexe
     */
    public void setRho(double rho);


    /**
     * @return la valeur de theta du nombre complexe
     */
    public double getTheta();


    /**
     * @param theta modifier la valeur de theta du nombre complexe
     */
    public void setTheta(double theta);


    /* Si on veut définir un constructeur qui prend le module et l'argument d'un nombre complexe en
    paramètre, il faut connaître d'abord la partie réelle x et la partie imaginaire y du nombre complexe.
    On ne va donc pas faire de constructeur, mais plutôt la méthode instanceTrigo ci-dessous : */
}
