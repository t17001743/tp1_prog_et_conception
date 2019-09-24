/* Exercice 2 - Version de la classe où il existe les 4 attributs x, y, rho, theta */

public class ComplexeC implements Complexe{

    double x;      //partie réelle
    double y;      //partie imaginaire
    double rho;    //module
    double theta;  //argument


    public ComplexeC(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public ComplexeC() {      //constructeur sans paramètre
        this.x = 0.0;
        this.y = 0.0;
    }

    /**
     * @param a un nombre complexe
     * @param b un nombre complexe
     * @return addition de a et b
     */
    public static ComplexeC plus(ComplexeC a, ComplexeC b){
        return new ComplexeC(a.getX() + b.getX(), a.getY() + b.getY());
    }


    /**
     * @param a un nombre complexe
     * @param b un nombre complexe
     * @return multiplication de a et b
     */
    public ComplexeC fois(ComplexeC a, ComplexeC b){
        return new ComplexeC(a.getRho()*b.getRho(), a.getTheta()+b.getTheta());
    }


    public double getX(){
        return this.x;
    }


    public void setX(double x){
        this.x = x;
        this.rho = Math.sqrt(this.x*this.x + getY()*getY());
        this.theta = (Math.asin(y/Math.sqrt(this.x*this.x + getY()*getY())));
    }


    public double getY(){
        return this.y;
    }


    public void setY(double y){
        this.y = y;
        this.rho = Math.sqrt(getX()*getX() + this.y*this.y);
        this.theta = (Math.asin(y/Math.sqrt(getX()*getX() + this.y*this.y)));
    }


    public double getRho(){
        return this.rho;
    }


    public void setRho(double rho){
        this.rho = rho;
        this.x = this.rho*Math.cos(this.theta);
        this.y = this.rho*Math.sin(this.theta);
    }


    public double getTheta(){
        return this.theta;
    }


    public void setTheta(double theta){
        this.theta = theta;
        this.x = this.rho*Math.cos(this.theta);
        this.y = this.rho*Math.sin(this.theta);
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


    public ComplexeC instanceTrigo(double rho, double theta){
        return new ComplexeC(rho*Math.cos(theta), rho*Math.sin(theta));
    }

}
