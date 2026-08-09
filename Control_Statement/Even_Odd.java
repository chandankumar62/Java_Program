import java.util.Scanner;

public class Even_Odd {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int num = input.nextInt();
    input.close();
    String result = num % 2 == 0 ? "Even" : "Odd";
    System.out.println("Your number is: " + result);
  }
}
