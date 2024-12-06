package step01;

import java.util.Scanner;

public class Solution_10430 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();
        String[] inputNum = input.split(" ");
        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(inputNum[i]);
        }

        int A = number[0];
        int B = number[1];
        int C = number[2];

        System.out.println((A + B) % C);
        System.out.println(((A % C) + (B % C)) % C);
        System.out.println((A * B) % C);
        System.out.println(((A % C) * (B % C)) % C);
    }
}
