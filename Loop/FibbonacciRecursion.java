import java.util.Scanner;

public class FibbonacciRecursion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int count = input.nextInt();
    for(int i = 1;i <= count; i++){
      System.out.println(fibbonacci(i) + " ");
    }
  }
  public static int fibbonacci(int position){
    if(position == 1){
      return 0;
    }
    if(position == 2){
      return 1;
    }
    return fibbonacci(position -1) + fibbonacci(position -2);
  }
}
