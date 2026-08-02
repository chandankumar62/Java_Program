import java.util.Scanner;

public class prime_number {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int num = input.nextInt();
    boolean prime = NumberPrime(num);
    if(prime){
      System.out.println("Your number is prime:");
    }else{
      System.out.println("Number is not prime");
    }
  }
  public static boolean NumberPrime(int num){
    int i = 2;
    while(i < num){
      if(num % i == 0){
      return false;
    }
    i++;
    }
    return true;
  }
}
