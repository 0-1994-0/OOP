public class AutoMain {
    public static void main(String[] args) {

        Auto a1 = new Auto("BMW", "G30", 220);
        System.out.println("Die Marke des Objektes ist: " +a1.getMarke());
        Auto a2 = new Auto("Mini", "Cooper");
        System.out.println(a2.getTyp());
        Auto a3 = new Auto();
        Auto a4 = new Auto("Audi");




    }
}
