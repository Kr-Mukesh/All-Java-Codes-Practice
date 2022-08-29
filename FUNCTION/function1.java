package FUNCTION;

import java.util.Scanner;

public class function1 {

    public static int calSum(int a, int b) {

        int sum = a + b;
        return sum;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("type two numbers with space here and press enter");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calSum(a, b);

        System.out.println("sum of two numbers---->" + sum);

    }

}
