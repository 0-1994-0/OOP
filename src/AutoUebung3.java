public class AutoUebung3 {

    String marke;
    String modell;
    int jahr;
    double geschwindigkeit;


    public AutoUebung3(String marke, String modell, int jahr, double geschwindigkeit) {
        this.marke = marke;
        this.modell = modell;
        this.jahr = jahr;
        this.geschwindigkeit = geschwindigkeit;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }


    public void gasGeben(double geschw){

        geschwindigkeit=geschwindigkeit*geschw;
        System.out.println(geschwindigkeit);
    }

    public void toStrings(){
        System.out.println("Marke: BMW, Modell:G30, Jahr:2020, Geschwindigkeit:210");

    }
}
