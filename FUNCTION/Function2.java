package FUNCTION;

import java.util.Scanner;

public class Function2 {

    public static int calmul(int a, int b) {

        int mul = a * b;
        return mul;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("type two numbers with space here and press enter");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int mul = calmul(a, b);

        System.out.println("mul of two numbers---->" + mul);

    }

}