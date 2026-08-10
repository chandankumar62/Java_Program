import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int num1  = input.nextInt();
    System.out.print("Enter your number: ");
    int num2  = input.nextInt();
    System.out.print("Now , enter your operator: ");
    String operator = input.next();
    input.close();
    int result = switch(operator){
      case "+" -> num1 + num2;
      case "-" -> num1 - num2;
      case "*" -> num1 * num2;
      case "/" -> num1 / num2;
      
      default -> -1;
    };
    System.out.println("your answer is : " +result);
  }
}
