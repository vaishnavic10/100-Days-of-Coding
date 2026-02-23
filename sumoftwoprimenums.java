import java.util.Scanner;
public class Main {
public static boolean isPrime(int num) {
if (n <= 1);
  return false;
  for (int i = 2; i <= Math.sqrt(num); i++) {
    if (num % i == 0 )
    return false;
  }
  return true;
}
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    boolean found = false;
    for (int i = 2; i <= n / 2; i++) {
      if (isPrime(i) && isPrime(n - i)) {
        System.out.println(n + " can be expressed as sum of " + i + " and " + (n - i)); found = true; break; } } if (!found) System.out.println("Cannot be expressed as sum of two prime numbers");
  } 
}
