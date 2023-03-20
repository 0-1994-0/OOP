public class Main {
    public static void main(String[] args) {
        //Objekt erstellen

        Rechteck rechtecks = new Rechteck(4, 7);
        // Konstruktor nur dafür notwendig
        rechtecks.getArea();
        rechtecks.getPerimeter();

        System.out.println(rechtecks.getArea());
        System.out.println(rechtecks.getPerimeter());

        rechtecks.setWidth(2);
        rechtecks.setHeight(4);

        System.out.println(rechtecks.getPerimeter());

        System.out.println(rechtecks.getHeight());
        System.out.println(rechtecks.getArea());
        System.out.println(rechtecks.getPerimeter());

        //Werte holen mit get-Methode





    }


}
