package videojuego; //Nombre del Paquete de la Clase
//Importes de mi Clase.
import javax.swing.JOptionPane;
/**
 * @author Arbay
 **/
public class Elfos extends Personajes { //Inicio de mi Clase "Elfos" que hereda de mi "Personajes".
    //Proceso de Definición de las Instancias: 
    Alimentacion alimenta = new Alimentacion(100,100);
    //Variable de tipo String llamada armaMagica. 
    String armaMagica;
    //Variable de tipo entero llamada combate.
    int combate;
    /**
     * Super Constructor heredado de la Clase "Personajes".
     * @param nombre
     * @param vida
     * @param energia
     * @param armaMagica 
     **/
    public Elfos(String nombre, int vida, float energia, String armaMagica) { //Inicio del Super Constructor.
        super(nombre, vida, energia);
        this.armaMagica = armaMagica;
    } //Fin del Super Constructor.
    /**
     * Método get de mi variable armaMagica.
     * @return armaMagica.
     **/
    public String getArma() { //Inicio del metodo get.
        return armaMagica;
    } //Fin del método get.
    /**
     * Método set de mi variable armaMagica.
     * @param arma 
     **/
    public void setArma(String arma) { //Inicio del método set.
        this.armaMagica = arma;
    } //Fin del método set.
    /**
     * Método de tipo entero el cual me permite asignarle el "daño" a mis Elfos.
     * @return combate.
     **/
    public int Ataques() {
        if (vida <= 0) return 0;
        combate = java.util.concurrent.ThreadLocalRandom.current().nextInt(1, 45);
        if (energia > 0) {
            combate += java.util.concurrent.ThreadLocalRandom.current().nextInt(0, 11);
            energia /= 2;
        }
        return combate;
    } //Fin del Método "Ataques".
    /**
     * Método de tipo entero el cual me permite determinar la cantidad que se sanaran mis Elfos.
     * @return vida.
     **/
    public int Sanacion() {
        if (vida > 0) setVida(vida + alimenta.getCuracionElfo());
        return vida;
    } //Fin del Método "Sanacion".
} //Fin de mi Clase "Elfos".
