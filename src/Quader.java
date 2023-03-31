public class Quader {

    private double lange;
    private double breite;
    private double hoehe;

    public double getLange() {
        return lange;
    }

    public void setLange(double lange) {
        this.lange = lange;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    public Quader(double lange, double breite, double hoehe) {
        this.lange = lange;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public double grundflaeche (){
       double flaeche= lange*breite;
        System.out.println("Die Grundflaeche betragt: " + flaeche);
       return flaeche;
    }

    public void skaliere (double faktor){
        this.lange = lange*faktor;
        this.breite = breite*faktor;
        this.hoehe = hoehe*faktor;
    }

    public double volumen(){
        double volume = lange*breite*hoehe;
        System.out.println("Das Volumen betragt : " + volume);
        return volume;
    }

    public double oberflaeche (){
        double oberflache = (2*(lange*hoehe)+(2*(lange*breite)+(2*(breite*hoehe))));
        System.out.println("Die Oberflaeche betragt: "+ oberflache);
        return oberflache;
    }

}

