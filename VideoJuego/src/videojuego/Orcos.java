package videojuego; //Nombre del Paquete de la Clase
import javax.swing.JOptionPane;
/**
 * @author Arbay
 */
public class Orcos extends Personajes { //Inicio de mi Clase "Combate" que hereda de mi clase "Personajes".
    //Proceso de Definición de las Instancias: 
    Alimentacion alimenta = new Alimentacion(100,100);
    //Variable de tipo String llamada armaGuerrera.
    String armaGuerrera; 
    //Variable de tipo entero llamada combate.
    int combate; 
    /**
     * Super Constructor de mi Clase Orcos Heredada de mi Clase Personajes.
     * @param nombre
     * @param vida
     * @param energia
     * @param armaMagica 
     **/
    public Orcos(String nombre, int vida, float energia, String armaMagica) { //Inicio Super Constructor.
        super(nombre, vida, energia);
        this.armaGuerrera = armaMagica;
    } //Fin Super Constructor.
    /**
     * Método get de mi variable armaGuerrera.
     * @return armaGuerrera.
     **/
    public String getArma() { //Inicio de mi Método get.
        return armaGuerrera;
    } //Fin de mi Método get.
    /**
     * Método set de mi variable armaGuerrera.
     * @param arma 
     **/
    public void setArma(String arma) { //Inicio de mi Método set.
        this.armaGuerrera = arma;
    } //Fin de mi Método set.
    /**
     * Método de tipo entero el cual me permite asignarle el "daño" a mis Orcos.
     * @return combate.
     **/
    public int Ataques() {
        if (vida <= 0) return 0;
        combate = java.util.concurrent.ThreadLocalRandom.current().nextInt(2, 51);
        return combate;
    } //Fin del Método "Ataques".
    /**
     * Método de tipo entero el cual me permite determinar la cantidad que se sanaran mis Orcos.
     * @return vida.
     **/
    public int Sanacion() {
        if (vida > 0) setVida(vida + alimenta.getCuracionOrco());
        return vida;
    } //Fin del Método "Sanacion".
} //Fin de mi Clase "Orcos".
