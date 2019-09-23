/* Exercice 2 */

public class Complexe {

    double x;  //partie réelle
    double y;  //partie imaginaire
    double rho, theta;


    public Complexe(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public Complexe() {      //constructeur sans paramètre
        this.x = 0.0;
        this.y = 0.0;
    }


    /**
     * @param a un nombre complexe
     * @param b un nombre complexe
     * @return addition de a et b
     */
    public Complexe plus(Complexe a, Complexe b){
        return new Complexe(a.getX() + b.getX(), a.getY() + b.getY());
    }


    /**
     * @param a un nombre complexe
     * @param b un nombre complexe
     * @return multiplication de a et b
    */
    public Complexe fois(Complexe a, Complexe b){
        return new Complexe(a.getRho()*b.getRho(), a.getTheta()+b.getTheta());
    }



    /**
     * @return la partie réelle x du nombre complexe
     */
    public double getX(){
        return this.x;
    }


    /**
     * @param x modifier la partie réelle x du nombre complexe
     */
    public void setX(double x){
        this.x = x;
    }


    /**
     * @return la partie imaginaire y du nombre complexe
     */
    public double getY(){
        return this.y;
    }


    /**
     * @param y modifier la partie imaginaire y du nombre complexe
     */
    public void setY(double y){
        this.y = y;
    }


    /**
     * @return la valeur de rho du nombre complexe
     */
    public double getRho(){
        return (Math.sqrt(getX()*getX() + getY()*getY()));
    }


    /**
     * @param rho modifier la valeur de rho du nombre complexe
     */
    public void setRho(double rho){
        this.rho = rho;
    }


    /**
     * @return la valeur de theta du nombre complexe
     */
    public double getTheta(){
        return (Math.asin(y/Math.sqrt(getX()*getX() + getY()*getY())));
    }


    /**
     * @param theta modifier la valeur de theta du nombre complexe
     */
    public void setTheta(double theta){
        this.theta = theta;
    }


    /**
     * @return une chaîne de caractères représentant le nombre complexe sous sa forme algébrique
     */
    public String toString() {
        return "(" + this.getX() + " + i*" + this.getY() + ")";
    }


    /**
     * @return une chaîne de caractères représentant le nombre complexe sous sa forme trigonométrique
     */
    public String toStringTrigo() {
        return "(" + this.getRho() + "(cos(" + this.getTheta() + ") + i sin(" + this.getTheta() + ")))";
    }

    /* Si on veut définir un constructeur qui prend le module et l'argument d'un nombre complexe en
    paramètre, il faut connaître d'abord la partie réelle x et la partie imaginaire y du nombre complexe.
    On ne va donc pas faire de constructeur, mais plutôt la méthode instanceTrigo ci-dessous : */

    /**
     * @param rho le module du nombre complexe
     * @param theta l'argument du nombre complexe
     * @return une instance de Complexe après l'avoir créée avec les paramètres passés
     */
    public Complexe instanceTrigo(double rho, double theta){
        return new Complexe(rho*Math.cos(theta), rho*Math.sin(theta));
    }


}
