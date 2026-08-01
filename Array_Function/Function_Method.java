import java.util.Scanner;

public class Function_Method{
  public static void main(String[] args) {
    int first = readNumber();
    int second = readNumber();
    int sum = first + second;
    System.out.print("Total Sum: " + sum);
  }
  public static int readNumber(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int number = input.nextInt();
    return number;
    
  }
}