public class Fakultaet {

    public static void main(String[] args) {


        fakulatet(5);


    }

    public static int fakulatet (int n){
       int i =1;
       int result=1;

       do {
           result= result*(n-i);
           System.out.println(result);

       }

       while (i<=n);


          System.out.println("Done");

        return result;
    }
}


