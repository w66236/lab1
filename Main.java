import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(getMyName());
        System.out.println(getMyAge());
        obliczenia(1,2);
    }

    public static String getMyName(){
        return "Jan";
    }

    public static int getMyAge(){
        return 23;
    }

    public static void obliczenia(int l1, int l2){
        System.out.println(l1 + " + "+l2+" = "+(l1+l2));
        System.out.println(l1 + " - "+l2+" = "+(l1-l2));
        System.out.println(l1 + " * "+l2+" = "+(l1*l2));
    }
}