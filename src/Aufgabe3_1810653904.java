import javax.swing.*;
import java.awt.*;

public class Aufgabe3_1810653904 {
    public static void main(String[]args){
        String eingabe= JOptionPane.showInputDialog(null,"Number");

        double alter=Double.parseDouble(eingabe); //Umwandlung in Double
        //JOptionPane.showMessageDialog(null,alter);

        //int alter1=Integer.parseInt(eingabe);
        //JOptionPane.showMessageDialog(null,alter1);

        //boolean alter2=Boolean.parseBoolean(eingabe);
        //JOptionPane.showMessageDialog(null,alter2);

        //long alter3=Long.parseLong(eingabe);
        //JOptionPane.showMessageDialog(null,alter3);

        //byte alter4=Byte.parseByte(eingabe);
        //JOptionPane.showMessageDialog(null,alter4);

        //short alter5=Short.parseShort(eingabe);
        //JOptionPane.showMessageDialog(null,alter5);

        //float alter6=Float.parseFloat(eingabe);
        //JOptionPane.showMessageDialog(null,alter6);

        //char alter7=eingabe.charAt(0);
        //JOptionPane.showMessageDialog(null,alter7);

        String newAlter=String.valueOf(alter);
        JOptionPane.showMessageDialog(null,newAlter);
    }
}