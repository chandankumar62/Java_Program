import java.util.Scanner;

public class Print_Even {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int size  = input.nextInt();
    int[] arr = new int[size];
    int index = 0;
    while(index < size){
      System.out.print("Please enter your number " + (index+1) + ": ");
      arr[index] = input.nextInt();
      index++;
    }
    for(int num: arr){
      if(num % 2 != 0){
        continue;
      }
      System.out.println("Your even number is " + num);
    }
    
  }
}
