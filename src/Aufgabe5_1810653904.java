import javax.swing.*;

public class Aufgabe5_1810653904 {
    public static void main(String[]args){
        int a=2;
        int b=3;
        int zahl1=Integer.parseInt(JOptionPane.showInputDialog("Zahl 1"));
        int zahl2=Integer.parseInt(JOptionPane.showInputDialog("Zahl 2"));
        forschleife(a);
        forschleife(b);
        whileschleife(a);
        whileschleife(b);
        nutzerschleife(zahl1, zahl2);
    }
    private static void forschleife(int zähler){
        for(int c=0;c<zähler;c++){
            System.out.println("Der Schleifenzähler ist: "+ (c+1));
        }
        //int c als Anfangspunkt, bis er zur letzen kleinen ganzen Zahl vor dem zähler kommt, postInkrementiert => nach jedem Durchlauf +1, +1 in der Klammer um den ersten Durchlauf zu werten
    }
    private static void whileschleife(int zähler){
        int d = 1;
        while(d<=zähler){
            if (d%2!=0){
                d++;
            }
            else if (d<=zähler){
                System.out.println("Der Schleifenzähler ist: " + (d++));
            }
//Solange int <= als die Anzahl des Zählers, Solange ungerade inkrementieren sonst ausgeben

        }
    }
    private static void nutzerschleife(int zähler1,int zähler2) {
        int zähler = 1;
        for (int e = 0; e<zähler1;e++) {
            for (int f=0;f<zähler2;f++) {
                System.out.println("Das ist der " + zähler + ". Durchlauf der inneren Schleife!");
                zähler++;
            }
            // beginnt bei 1 für ersten durchlauf, solange e kleiner wird inkrementiert, danach wird f so oft inkrementiert wie der zähler2,
        }
    }
}
