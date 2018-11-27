public class Aufgabe4_1810653904 {
    public static void main (String[]args){
        for(int anfangBisEnde = 1; anfangBisEnde < 11; anfangBisEnde++){
            System.out.println("Der Schleifenzähler ist: " + anfangBisEnde);
        }
        //int anfangBisEnde als Anfangspunkt, bis er zur letzen kleinen ganzen Zahl vor 11 kommt, postInkrementiert => nach jedem Durchlauf +1
        int zahl=1;
        do{
            System.out.println("Der Schleifenzähler ist: " + zahl);
            zahl++;
        }
        while (zahl<11);
        //Während zahl kleiner als 11 sobald nicht mehr => abbruch
    }
}
