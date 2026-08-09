import java.util.Scanner;

public class Absolute {
  public static void main(String[] args) {
    Scanner input  = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int num = input.nextInt();
    input.close();
    int result = num >= 0 ? num : -num;
    System.out.println("Absolute number: " + result);
  }
}
