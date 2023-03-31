public class Recursion {
    public static void main(String[] args) {
        recursion(10);
    }

    public static void recursion (int n) {
        if (n!=0){
            System.out.println(n);
            n--;
            recursion(n);

        } else {
            System.out.println("Done");
        }
    }

}
