import java.util.Scanner;

public class prime {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int num = input.nextInt();
    boolean isPrime = isPrime(num);
    if(isPrime){
      System.out.println("Prime number");
    }else{
      System.out.println("Not prime number");
    }
  }
  public static boolean isPrime(int num){
    for (int i = 2; i < num; i++){
      if(num % i == 0){
        return false;
      }
    }
    return true;
  }
}
