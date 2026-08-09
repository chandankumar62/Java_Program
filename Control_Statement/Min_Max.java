import java.util.Scanner;

public class Min_Max {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int num1 = input.nextInt();
    System.out.print("Enter your number: ");
    int num2 = input.nextInt();
    Min_Max ternary = new Min_Max();
    int min = ternary.min(num1, num2);
    System.out.println("minimum number is : " + min);
    int max = ternary.max(num1, num2);
    System.out.println("maximum number is : " + max);
    input.close();
  }
  public int min(int num1, int num2){
    
    return num1 < num2? num1 : num2;
  }
  public int max(int num1, int num2){
    return num1 > num2? num1 : num2;
  }
}
