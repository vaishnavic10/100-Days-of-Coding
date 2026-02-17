import java.util.Scanner;

public class Main {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        // Add fractions
        int x3 = (x1 * y2) + (x2 * y1);
        int y3 = (y1 * y2);

        int gcd = gcd(x3, y3);

        x3 = x3 / gcd;
        y3 = y3 / gcd;

        System.out.println(x3 + "/" + y3);
    }
}
