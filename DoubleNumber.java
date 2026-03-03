import java.util.Scanner;

public class DoubleNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = n << 1;  

        System.out.println(result);

        sc.close();
    }
}
