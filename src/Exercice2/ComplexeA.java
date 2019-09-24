package Exercice2;
/* Exercice 2 - Version de la classe où il n'existe que les attributs x et y */

public class ComplexeA implements Complexe {

    double x;  //partie réelle
    double y;  //partie imaginaire


    public ComplexeA(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public ComplexeA() {      //constructeur sans paramètre
        this.x = 0.0;
        this.y = 0.0;
    }

    /**
     * @param a un nombre complexe
     * @param b un nombre complexe
     * @return addition de a et b
     */
    public static ComplexeA plus(ComplexeA a, ComplexeA b){
        return new ComplexeA(a.getX() + b.getX(), a.getY() + b.getY());
    }


    /**
     * @param a un nombre complexe
     * @param b un nombre complexe
     * @return multiplication de a et b
     */
    public ComplexeA fois(ComplexeA a, ComplexeA b){
        return new ComplexeA(a.getRho()*b.getRho(), a.getTheta()+b.getTheta());
    }


    public double getX(){
        return this.x;
    }


    public void setX(double x){
        this.x = x;
    }


    public double getY(){
        return this.y;
    }


    public void setY(double y){
        this.y = y;
    }


    public double getRho(){
        return (Math.sqrt(getX()*getX() + getY()*getY()));
    }


    public void setRho(double rho){
        this.x = rho*Math.cos(getTheta());
        this.y = rho*Math.sin(getTheta());
    }


    public double getTheta(){
        return (Math.asin(y/Math.sqrt(getX()*getX() + getY()*getY())));
    }


    public void setTheta(double theta){
        this.x = getRho()*Math.cos(theta);
        this.y = getRho()*Math.sin(theta);
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
     * @return une instance de Exercice2.ComplexeA après l'avoir créée avec les paramètres passés
     */
    public ComplexeA instanceTrigo(double rho, double theta){
        return new ComplexeA(rho*Math.cos(theta), rho*Math.sin(theta));
    }


}
