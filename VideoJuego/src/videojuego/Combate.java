package videojuego; //Nombre del Paquete de la Clase
//Importes de mi Clase.
import javax.swing.JOptionPane;
/**
 * @author Arbay Fernández Solano.
 * @date 13/04/2016.
 **/
public class Combate { //Inicio de mi Clase "Combate".
    //Proceso de Definición de las Instancias: 
    //Intancio mi Clase "Alimentacion".
    Alimentacion alimenta = new Alimentacion(100,100);
    //Intancio mi Clase "Elfos".
    Elfos mielfo = new Elfos("", 100, 100, "");
    //Intancio mi Clase "Orcos".
    Orcos miorco = new Orcos("", 100, 100, "");
    /**
     * Método de tipo void el cual define el ganardor del combate.
     **/
    public void vs() { //Inicio del Método "vs".
        while (mielfo.vida > 0 || miorco.vida > 0) { //Inicio while.
            if (mielfo.vida <= 0) { //Inicio if.
                System.out.println("El Arma del Elfo fue: " + mielfo.getArma());
                System.out.println("El Arma del Orco fue: " + miorco.getArma());
                JOptionPane.showMessageDialog(null, "El Ganador es el Orco", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            } else if (miorco.vida <= 0) { //else if.
                System.out.println("El Arma del Elfo fue: " + mielfo.getArma());
                System.out.println("El Arma del Orco fue: " + miorco.getArma());
                JOptionPane.showMessageDialog(null, "El Ganador es El Elfo", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            } //Fin del if.
            //Variable de tipo char la cual permite elegir una acción.
            final char pregunta = JOptionPane.showInputDialog("Deseas 1- Atacar o 2- Curarte").charAt(0);
            if (pregunta == '1') { //Inicio if (1).
                miorco.vida = miorco.vida - mielfo.Ataques();
                System.out.println("la vida del orco " + miorco.nombre + "  es: " + miorco.vida);
            } else { //sino...
                mielfo.vida = mielfo.Sanacion();
                if (mielfo.vida >= 100) { //Inicio if (2).
                    mielfo.vida = 100;
                } //Fin if (2).
                System.out.println("La vida del Elfo " + mielfo.nombre + " es de: " + mielfo.vida);
            } //Fin if (1).
            //Variable de tipo char la cual permite elegir una acción.
            final char pregunta2 = JOptionPane.showInputDialog("Deseas 1- Atacar o 2- Curarte").charAt(0);
            if (pregunta2 == '1') { //Inicio if (1).
                mielfo.vida = mielfo.vida - miorco.Ataques();
                System.out.println("la vida del elfo " + mielfo.nombre + " es: " + mielfo.vida);
            } else { //Sino ...
                miorco.vida = miorco.Sanacion();
                if (miorco.vida >= 100) { //Inicio if (2).
                    miorco.vida = 100;
                } //Fin if (2).
                System.out.println("La vida del orco " + miorco.nombre + " es: " + miorco.vida);
            } //Fin if (1).
        } //Fin while.
    } //Fin del Método "vs".
} //Fin de mi Clase "Combate".
