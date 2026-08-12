import java.util.Scanner;

public class factorial {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter you number: ");
    int num = input.nextInt();
    //long fact = factorialnumber(num);
    long fact = factorial(num);
    System.out.println("factorial is : " + fact);
  }
  public static long factorial(int num){
    if(num == 1){
      return 1;
    }
    return num * factorial(num - 1);
  }
  public static long factorialnumber(int num){
    long result = 1;
    for(int i= 1; i <=num;i++){
      result *= i;
    }
    return result;
  }  
}
