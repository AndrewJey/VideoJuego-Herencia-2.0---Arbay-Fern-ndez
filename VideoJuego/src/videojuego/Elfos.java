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
        super(JOptionPane.showInputDialog(null, "Ingrese el nombre del Elfo"), 100, energia);
        this.armaMagica = JOptionPane.showInputDialog(null, "Ingrese el nombre del arma");
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
    public int Ataques() { //Inicio del Método "Ataques".
        String poder = String.valueOf((int) (Math.random() * 11));
        //Variable de tipo entero llamada aux.
        int aux = (int) (Math.random() * 2);
        if (aux > 0 && this.energia > 0) {
            this.combate = this.combate + Integer.parseInt(poder);
            this.energia = this.energia / 2;
            System.out.println(this.nombre + " tu energia actual es de: " + this.energia);
            System.out.println("Tu bonus de daño fue de: " + poder);
        } else {
            this.combate = (int) (Math.random() * 45);
        }
        JOptionPane.showMessageDialog(null, "Haz Inflingido: " + this.combate + "p de daño", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        return combate;
    } //Fin del Método "Ataques".
    /**
     * Método de tipo entero el cual me permite determinar la cantidad que se sanaran mis Elfos.
     * @return vida.
     **/
    public int Sanacion() { //Inicio del Método "Sanacion".
        this.vida = vida + alimenta.getCuracionElfo();
        return vida;
    } //Fin del Método "Sanacion".
} //Fin de mi Clase "Elfos".
