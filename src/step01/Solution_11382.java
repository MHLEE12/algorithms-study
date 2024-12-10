package step01;

import java.util.Scanner;

public class Solution_11382 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] splitInput = input.split(" ");
        long result = 0;
        for (String str : splitInput) {
            result += Long.valueOf(str);
        }
        s.close();
        System.out.println(result);
    }
}
