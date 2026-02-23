import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int result = 0;
        int place = 1;

        while (num > 0) {

            int digit = num % 10;

            if (digit == 0) {
                digit = 1;
            }

            result = digit * place + result;

            place = place * 10;

            num = num / 10;
        }

        System.out.println(result);
    }
}
