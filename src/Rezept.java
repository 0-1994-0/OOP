import java.util.Scanner;

public class Rezept {

    int anzahlPersonen = 2;
    String[] zutatenName = {"Nudeln", "Tomatensoße"};
    double[][] zutaten = {{300, 1.0}, {100, 2.0}};

    public boolean allergisch(String zutat) {
        boolean allergisch = false;

        for (int i = 0; i < zutatenName.length; i++) {
            if (zutatenName[i].equals(zutat)) {
               allergisch=true;
            }
        }
        return allergisch;
    }

    public boolean laktoseFrei() {
        boolean removed = false;

        for (int i = 0; i < zutatenName.length; i++) {
            if (zutatenName[i].toLowerCase().contains("milch") || zutatenName[i].contains("käse")) {
                zutaten[i][0] = 0;
                zutaten[i][1] = 0;
                removed = true;
            }
        }
        return removed;
    }

    public double kostet() {
        double summe = 0;
        for (int i = 0; i < zutaten.length; i++) {
            summe = summe + zutaten[i][1];
        }
        return summe;
    }


    public double kosterProPerson() {
        double summe = 0;
        for (int i = 0; i < zutaten.length; i++) {
            summe = (summe + zutaten[i][1]) / anzahlPersonen;
        }
        return summe;
    }


    public void aenderePersonen(int anzahl) {

        if (anzahl > 0) {
            for (int i = 0; i < zutaten.length; i++) {
                zutaten[i][0] = (zutaten[i][0] * anzahl) / anzahlPersonen;
                zutaten[i][1] = (zutaten[i][1] * anzahl) / anzahlPersonen;
            }
            anzahlPersonen = anzahl;
        }
    }

    public int getAnzahlPersonen() {
        return anzahlPersonen;
    }

    public void setAnzahlPersonen(int anzahlPersonen) {
        this.anzahlPersonen = anzahlPersonen;
    }

    public Rezept(int anzahlPersonen, String[] zutatenName, double[][] zutaten) {
        this.anzahlPersonen = anzahlPersonen;
        this.zutatenName = zutatenName;
        this.zutaten = zutaten;
    }
}






