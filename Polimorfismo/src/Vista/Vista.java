package Vista;

import javax.swing.JOptionPane;
import java.lang.Object;

public class Vista {

    int numero;
    Object[] opciones = new Object[3];

    int menu() {
        opciones[0] = "avion";
        opciones[1] = "carro";
        opciones[2] = "lancha";
        numero = JOptionPane.showOptionDialog(null, null, "opciones", 0, 0, null, opciones, opciones[0]);
        switch (numero) {
            case 1:

            case 2:
            case 3:
            default:
                return numero;
        }
    }
}
