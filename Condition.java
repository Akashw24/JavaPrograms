package Array.arrayeg;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 21;
        int b = 3;

        if (a % b == 0 && a % 7 == 0) {
            System.out.println("a is divisible by both b and 7.");

        } else {
            System.out.println("a is not divisible by both b and 7.");
        }
    }

}
}


