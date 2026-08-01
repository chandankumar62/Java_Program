import java.util.Scanner;

public class sum_of_digits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int num = input.nextInt();
    int sum = SumDigits(num);
    System.out.println("Sum of digits: " + sum);
  }
  public static int SumDigits(int num) {
    int sum = 0;
    while(num > 0){
      sum +=num % 10;
      num /= 10;
    }
    return sum;
  }
}
