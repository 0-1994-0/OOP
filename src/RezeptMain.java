public class RezeptMain {
    public static void main(String[] args) {

        String[] zutatenName = {"nudeln", "tomatensoße", "milch", "parmesan"};
        double[][] zutaten = {{300, 1.0}, {100, 2.0}, {50, 0.5}, {25, 1.5}};
        Rezept rezept = new Rezept(4, zutatenName, zutaten);


        System.out.println(rezept.allergisch("zucchini"));
        System.out.println(rezept.laktoseFrei());
        System.out.println(rezept.kostet());
        System.out.println(rezept.kosterProPerson());
        rezept.aenderePersonen(7);


    }
}
