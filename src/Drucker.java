public class Drucker {

    private String zeichenkette;
    private int ganzeZahlen;
    private double fließkommazahl;
    private boolean wert;


    public Drucker(String zeichenkette, int ganzeZahlen, double fließkommazahl, boolean wert) {
        this.zeichenkette = zeichenkette;
        this.ganzeZahlen = ganzeZahlen;
        this.fließkommazahl = fließkommazahl;
        this.wert = wert;
    }


    public String getZeichenkette() {
        return zeichenkette;
    }

    public void setZeichenkette(String zeichenkette) {
        this.zeichenkette = zeichenkette;
    }

    public int getGanzeZahlen() {
        return ganzeZahlen;
    }

    public void setGanzeZahlen(int ganzeZahlen) {
        this.ganzeZahlen = ganzeZahlen;
    }

    public double getFließkommazahl() {
        return fließkommazahl;
    }

    public void setFließkommazahl(double fließkommazahl) {
        this.fließkommazahl = fließkommazahl;
    }

    public boolean isWert() {
        return wert;
    }

    public void setWert(boolean wert) {
        this.wert = wert;
    }


    public void ausdrucken (String zeichenkette){
        System.out.println(zeichenkette);
    }




}
