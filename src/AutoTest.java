public class AutoTest {
    public static void main(String[] args) {


        AutoUebung3 auto = new AutoUebung3("Toyota", "Camry", 2018, 50);
        AutoUebung3 auto1 = new AutoUebung3("VW", "Touran", 2011, 35);



        auto.gasGeben(2);
        auto.toStrings();
        auto1.toStrings();


    }
}
