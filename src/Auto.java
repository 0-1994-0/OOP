public class Auto {
    private String marke;
    private String typ;
    private int ps = 0;




    Auto(String marke, String typ, int ps) {
        this.marke = marke;
        this.typ = typ;
        this.ps = ps;
    }

    Auto(String marke, String typ) {
        this.marke = marke;
        this.typ = typ;
        this.ps = 150;
    }
    Auto() {
        this.marke = "Dummy";
        this.typ = "Dummy";
        this.ps = 0;
    }

    Auto(String marke) {
        this.marke = marke;
    }


    public void setMarke(String m) {
        this.marke = m;
    }

    public String getMarke() {
        return marke;
    }

    public void setTyp(String p){
        this.typ=p;
    }

    public String getTyp(){
        return typ;
    }

    public void setPs (int ps){
        this.ps=ps;
    }

    public int getPs(){
        return ps;


    }
public void autoInformation(){
    System.out.println("Das Auto " + marke + " hat " +ps);
}
}
