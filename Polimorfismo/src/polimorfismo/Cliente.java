/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;
import Clases.*;
import java.lang.Object;
import javax.swing.JOptionPane;
/**
 *
 * @author lenovo
 */
public class Cliente {

    public static void main(String[] args) {
        Object transporte;
        Object[] opciones=(MedioDeTransporte[]) new Object[3];
        opciones[0]="avion";
        opciones[1]="carro";
        opciones[2]="";
        JOptionPane.showOptionDialog(null, args, "opciones", 0, 0, null, opciones, opciones[0]);
        
    }
    
}
