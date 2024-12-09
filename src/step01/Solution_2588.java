package step01;

import java.util.Scanner;

public class Solution_2588 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int first = s.nextInt();
        int second = s.nextInt();

        int second_f = second / 100;
        int second_s = (second % 100) / 10;
        int second_t = second % 10;

        System.out.println(first * second_t);
        System.out.println(first * second_s);
        System.out.println(first * second_f);
        System.out.println(first * second);
    }
}
