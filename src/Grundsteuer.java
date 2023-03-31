import java.util.Scanner;

public class Grundsteuer {


    public void info() {
//        Scanner scanner = new Scanner(System.in);
//int spalte1= int gundstuecke2 [0][0];
//int spalte2= int grundstuecke3[0][1];
//int spalte3 = int grundstuecke [0][2];
//
//
//
//        do{
//            System.out.println("Typ: ");
//            spalte1 = scanner.nextInt();
//            System.out.println("Laenge: ");
//            spalte2 = scanner.nextInt();
//            System.out.println("Breite: ");
//            spalte3 = scanner.nextInt();

        int[][] grundstuecke = {
                {1, 30, 40},
                {2, 20, 50},
                {3, 10, 30}
        };

        for (int[] grundstuecke2 : grundstuecke) {
            for (int grundstuecke3 : grundstuecke2) {
                System.out.print("[ " + grundstuecke3+ " ]");
            }
            System.out.println();
        }
    }
        public double grundsteuerBerechnen () {
            int[][] grundstuecke = {
                    {1, 30, 40},
                    {2, 20, 50},
                    {3, 10, 30}
            };

            double summe = 0;
            int typ = 0;
            int laenge = 0;
            int breite = 0;
            double grundsteuer = 0;

            for (int[] grundstuecke2 : grundstuecke) {
//            for (int grundstuecke3 : grundstuecke2) {
                typ = grundstuecke2[0];
                laenge = grundstuecke2[1];
                breite = grundstuecke2[2];

                switch (typ) {

                    case 1:
                        grundsteuer = 3.20 * (laenge * breite);
                        break;

                    case 2:
                        grundsteuer = 2.10 * (laenge * breite);
                        break;
                    case 3:
                        grundsteuer = 0.90 * (laenge * breite);
                }

                summe = summe + grundsteuer;
            }
//            System.out.println(summe);
            return summe;
        }
    }