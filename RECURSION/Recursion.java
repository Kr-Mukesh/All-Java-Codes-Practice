package RECURSION;

public class Recursion {

    public static void printNumb(int n) {
        if (n == 5) {
            return;
        }
        System.out.println(n);
        printNumb(n + 1);

    }

    public static void main(String[] args) {
        int n = 0;
        printNumb(n);
    }
}
