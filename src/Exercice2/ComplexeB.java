package Exercice2;
/* Exercice 2 - Version de la classe où il n'existe que les attributs rho et theta */

public class ComplexeB implements Complexe {

    double rho;    //module
    double theta;  //argument


    public ComplexeB(double rho, double theta) {
        this.rho = rho;
        this.theta = theta;
    }


    public ComplexeB() {      //constructeur sans paramètre
        this.rho = 0.0;
        this.theta = 0.0;
    }

    /**
     * @param a un nombre complexe
     * @param b un nombre complexe
     * @return addition de a et b
     */
    public static ComplexeB plus(ComplexeB a, ComplexeB b){
        return new ComplexeB(a.getX() + b.getX(), a.getY() + b.getY());
    }


    /**
     * @param a un nombre complexe
     * @param b un nombre complexe
     * @return multiplication de a et b
     */
    public ComplexeB fois(ComplexeB a, ComplexeB b){
        return new ComplexeB(a.getRho()*b.getRho(), a.getTheta()+b.getTheta());
    }


    public double getX(){
        return this.rho*Math.cos(this.theta);
    }


    public void setX(double x){
        this.rho = Math.sqrt(x*x + getY()*getY());
        this.theta = (Math.asin(getY()/Math.sqrt(x*x + getY()*getY())));
    }


    public double getY(){
        return this.rho*Math.sin(this.theta);
    }


    public void setY(double y){
        this.rho = Math.sqrt(getX()*getX() + y*y);
        this.theta = (Math.asin(y/Math.sqrt(getX()*getX() + y*y)));
    }


    public double getRho(){
        return this.rho;
    }


    public void setRho(double rho){
        this.rho = rho;
    }


    public double getTheta(){
        return this.theta;
    }


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


    public ComplexeB instanceTrigo(double rho, double theta){
        return new ComplexeB(rho*Math.cos(theta), rho*Math.sin(theta));
    }
}
