package FUNCTION;

import java.util.Scanner;

public class Function3 {

    public static int calmul(int a, int b, int c) {

        return a * b * c;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("type three numbers with space here and press enter");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("mul of three numbers---->" + calmul(a, b, c));

    }

}