import java.util.scanner;
public class ASCIIValue {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

  char ch = sc.next().charAt(0);
    int ascii = ch; //implicit type conversion
    System.out.println(ascii);

  sc.close();
  }
}
