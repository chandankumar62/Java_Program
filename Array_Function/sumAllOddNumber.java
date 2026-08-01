import java.util.Scanner;

public class sumAllOddNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int num = input.nextInt();
    int sum = SumAllOddNumber(num);
    System.out.println("OddSum till " + num + " is: " + sum);
    input.close();
    
  }
  public static int SumAllOddNumber(int num){
    int sum = 0;
    int i = 1;
    while(i <= num){
      sum = sum + i;
      i +=2;
    }
    return sum;
  }
}
