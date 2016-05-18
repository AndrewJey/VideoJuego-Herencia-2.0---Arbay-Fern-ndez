package videojuego; //Nombre del Paquete de la Clase
/**
 * @author Arbay Fernández Solano.
 * @date 12/04/2016
 **/
public class Alimentacion { //Inicio de mi Clase "Alimentacion".
    //Variable de tipo entero llamada curacion.
    int curacion;
    //Variable de tipo entero llamada energia.
    int energia;
    /**
     * Método Constructor de mi Clase "Alimentacion".
     * @param curacion 
     * @param energia 
     **/
    public Alimentacion(int curacion, int energia) { //Inicio del Constructor.
        this.curacion = curacion;
        this.energia = energia;
    } //Fin del Constructor.
    /**
     * Método setCuracionElfo de mi variable curacion.
     * @param curacion 
     **/
    public void setCuracionElfo(int curacion) { //Inicio del Método set.
        this.curacion = curacion;
    } //Fin del Método set.
    /**
     * Método setCuracionOrco de mi variable curacion.
     * @param curacion 
     **/
    public void setCuracionOrco(int curacion) { //Inicio del Método set.
        this.curacion = curacion ;
    } //Fin del Método set.
    /**
     * Método getCuracionElfo de mi variable curacion.
     * @return (int) (this.curacion * 0.25).
     **/
    public int getCuracionElfo() { //Inicio del Método get.
        return (int) (this.curacion * 0.25);
    } //Fin del Método get.
    /**
     * Método getCuracionOrco de mi variable curacion.
     * @return (int) (this.curacion * 0.50).
     */
    public int getCuracionOrco() {//Inicio del Método get.
        return (int) (this.curacion * 0.50);
    } //Fin del Método get.
    /**
     * Método setEnergiaElfo de mi variable energia.
     * @param energia 
     **/
    public void setEnergiaElfo(int energia) { //Inicio del Método set.
        this.energia = energia;
    } //Fin del Método set.
    /**
     * Método setEnergiaOrco de mi variable energia.
     * @param energia 
     **/
    public void setEnergiaOrco(int energia) { //Inicio del Método set.
        this.energia = energia;
    } //Fin del Método set.
    /**
     * Método getEnergiaElgo de mi variable energia.
     * @return (int) (this.energia * 0.15)
     **/
    public int getEnergiaElfo() { //Inicio del Método get.
        return (int) (this.energia * 0.15);
    } //Fin del Método get.
    /**
     * Método getEnergiaOrco de mi variable energia.
     * @return (int) (this.energia * 0.25)
     **/
    public int getEnergiaOrco() { //Inicio del Método get.
        return (int) (this.energia * 0.25);
    } //Fin del Método get.
} //Fin de mi Clase Alimentacion.
