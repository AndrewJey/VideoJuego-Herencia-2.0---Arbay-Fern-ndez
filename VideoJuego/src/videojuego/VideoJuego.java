package videojuego; //Nombre del Paquete de la Clase
/**
 * @author Arbay Fernández Solano.
 * @date 12/04/2016
 **/
public class VideoJuego { //Nombre del Main del Programa
    /**
     * @param args the command line arguments
     **/
    public static void main(String[] args) { //Inicio y Argumentación del Main
      //Proceso de Definición de las Instancias:   
      //Instancio mi Clase Combate.
      Combate micombate = new Combate ();
      //Llamo a mi Método "vs" de mi Clase Combate.
      micombate.vs();
    }//Fin del Main
} //Fin del Programa en Java