import javax.swing.*;

    public class Aufgabe2_1810653904 {
        public static <zahl2> void main (String[]args){
            int zahl1= Integer.parseInt(JOptionPane.showInputDialog(null, "Gib Zahl ein")); //String aus Eingabe in int umwandeln
            int zahl2= Integer.parseInt(JOptionPane.showInputDialog(null, "Gib noch mehr Zahl ein"));
            int durchlauf= 0;
            if (zahl1==zahl2){ //Zahlen von Anfang an gleich => While-Schleife nicht nötig
                System.out.println(zahl2);
            }
            while (zahl1!=zahl2){ //Solange ungleich =>Schleife läuft durch
                durchlauf++;
                if (zahl1<zahl2){
                    zahl1++;
                    //Jeden Durchlauf plus 1 bis gleich
                }if (zahl1>zahl2){
                    zahl2++;
                    // Jeden Durchlauf plus 1 bis gleich
                }if (zahl1==zahl2) {
                    System.out.println(durchlauf + " Durchlauf gebraucht"); //Sobald zahlen gleich => Ausgabe
                }
            }
        }
    }


