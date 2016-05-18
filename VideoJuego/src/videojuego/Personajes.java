package videojuego; //Nombre del Paquete de la Clase
/**
 * @author Arbay Fernández Solano.
 * @date 12/04/2016
 **/
public class Personajes { //Inicio de la clase "Personajes".
    String nombre; //Variable de tipo String llamada nombre.
    int vida; //Variable de tipo entero llamada vida.
    float energia; //Variable de tipo flotante llamda energia.
    /**
     * Método Constructor de mi clase Personajes.
     * @param nombre
     * @param vida
     * @param energia 
     **/
    public Personajes(String nombre, int vida, float energia) {//Inicio del Constructor.
        this.nombre = nombre;
        this.vida = vida;
        this.energia = energia;
    }//Fin del Constructor.
    //Primero se codifican los set de mis variables y luego los gets. 
    /**
     * Método set de mi variable nombre.
     * @param nombre 
     **/
    public void setNombre(String nombre) { //Inicio del método set.
        this.nombre = nombre;
    } //Fin del método set.
    /**
     * Método set de mi variable vida.
     * @param vida 
     **/
    public void setVida(int vida) { //Inicio del método set.
        this.vida = vida;
    } //Fin del método set.
    /**
     * Método set de mi variable energia.
     * @param energia 
     **/
    public void setEnergia(float energia) { //Inicio del método set.
        this.energia = energia;
    }//Fin del método set.
    /**
     * Método get de mi variable nombre.
     * @return nombre.
     **/
    public String getNombre() { //Inicio del método get.
        return nombre;
    } //Fin del método get.
    /**
     * Método get de mi variable vida.
     * @return vida
     **/
    public int getVida() { //Inicio del método get.
        return vida;
    } //Fin del método get.
    /**
     * Método get de mi variable energia.
     * @return energia.
     **/
    public float getEnergia() { //Inicio del método get.
        return energia;
    } //Fin del método get.
}//Fin de la clase Personajes.
