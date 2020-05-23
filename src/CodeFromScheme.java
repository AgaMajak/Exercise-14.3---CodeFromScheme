import java.util.Scanner;

import static java.lang.Math.pow;

public class CodeFromScheme {
    public static void main(String[] args) {


        int x = 0;
        int sum = 0;

        while (pow(x, 2) < 100) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj cyfrę");
            x = scan.nextInt();
            sum += x;
        }

        sum = sum % 2;

        System.out.println(sum);
    }
}
