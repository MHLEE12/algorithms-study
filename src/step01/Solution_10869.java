package step01;

import java.util.Scanner;

public class Solution_10869 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int first = s.nextInt();
        int second = s.nextInt();
        s.close();

        System.out.println(first + second);
        System.out.println(first - second);
        System.out.println(first * second);
        System.out.println(first / second);
        System.out.println(first % second);
    }
}
