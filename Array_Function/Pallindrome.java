import java.util.Scanner;

public class Pallindrome{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int num = input.nextInt();
    boolean isPallindrome = pallindrome(num);
    if(isPallindrome){
      System.out.println("Your number is a pallindrome");
    }else{
      System.out.println("Your number is not a pallindrome");
    }
    input.close();
    
  }
  public static boolean pallindrome(int num){
    return num == reverse(num);
  }
  public static int reverse(int num){
    int newNumber = 0;
    while(num > 0){
      int digits = num % 10;
      newNumber = newNumber * 10 + digits;
      num /= 10;
    }
    return newNumber;
  }
}