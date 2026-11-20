package videojuego;

import javax.swing.JOptionPane;

/** Turnos comprobables sin diálogos; la interfaz solo solicita decisiones. */
public class Combate {
    private final Elfos mielfo = new Elfos("Elfo", 100, 100, "Arco");
    private final Orcos miorco = new Orcos("Orco", 100, 100, "Hacha");

    public Elfos getElfo() { return mielfo; }
    public Orcos getOrco() { return miorco; }

    public String ganador() {
        if (mielfo.getVida() <= 0 && miorco.getVida() <= 0) return "Empate";
        if (mielfo.getVida() <= 0) return "Orco";
        if (miorco.getVida() <= 0) return "Elfo";
        return null;
    }

    public String jugarTurno(int accionElfo, int accionOrco) {
        if ((accionElfo != 1 && accionElfo != 2) || (accionOrco != 1 && accionOrco != 2)) throw new IllegalArgumentException("Usa 1 para atacar o 2 para curar.");
        if (ganador() != null) return ganador();
        if (accionElfo == 1) miorco.setVida(miorco.getVida() - mielfo.Ataques()); else mielfo.Sanacion();
        if (ganador() == null) {
            if (accionOrco == 1) mielfo.setVida(mielfo.getVida() - miorco.Ataques()); else miorco.Sanacion();
        }
        return ganador();
    }

    public void vs() {
        String elfo = JOptionPane.showInputDialog("Nombre del Elfo (Cancelar para salir)");
        if (elfo == null) return;
        String orco = JOptionPane.showInputDialog("Nombre del Orco (Cancelar para salir)");
        if (orco == null) return;
        mielfo.setNombre(elfo); miorco.setNombre(orco);
        Object[] acciones = {"Atacar", "Curar", "Salir"};
        while (ganador() == null) {
            String vidas = "Elfo: " + mielfo.getVida() + " · Orco: " + miorco.getVida();
            int primera = JOptionPane.showOptionDialog(null, vidas, "Turno de " + mielfo.getNombre(), JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, acciones, acciones[0]);
            if (primera < 0 || primera == 2) return;
            int segunda = JOptionPane.showOptionDialog(null, vidas, "Turno de " + miorco.getNombre(), JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, acciones, acciones[0]);
            if (segunda < 0 || segunda == 2) return;
            jugarTurno(primera + 1, segunda + 1);
            JOptionPane.showMessageDialog(null, "Elfo: " + mielfo.getVida() + " · Orco: " + miorco.getVida());
        }
        JOptionPane.showMessageDialog(null, "Resultado: " + ganador());
    }
}
