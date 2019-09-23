public class Complexe {


    /**
     * @param a un nombre complexe
     * @param b un nombre complexe
     * @return addition de a et b
     */
    public Complexe plus(Complexe a, Complexe b){
        return (a.getX() + b.getX()) + "i"*(a.getY() + b.getY());
    }


    /**
     * @param a un nombre complexe
     * @param b un nombre complexe
     * @return multiplication de a et b
     */
    public Complexe fois(Complexe a, Complexe b){
        return ((a.getRho()*b.getRho())*Math.exp("i"*(a.getTheta()+b.getTheta())));
    }


    /**
     * @return la partie réelle x du nombre complexe
     */
    public double getX(){

    }


    /**
     * @param x modifier la partie réelle x du nombre complexe
     */
    public void setX(double x){

    }


    /**
     * @return la partie imaginaire y du nombre complexe
     */
    public double getY(){

    }


    /**
     * @param y modifier la partie imaginaire y du nombre complexe
     */
    public void setY(double y){

    }


    /**
     * @return la valeur de rho du nombre complexe
     */
    public double getRho(){

    }


    /**
     * @param rho modifier la valeur de rho du nombre complexe
     */
    public void setRho(double rho){

    }


    /**
     * @return la valeur de theta du nombre complexe
     */
    public double getTheta(){

    }


    /**
     * @param theta modifier la valeur de theta du nombre complexe
     */
    public void setTheta(double theta){

    }
}
