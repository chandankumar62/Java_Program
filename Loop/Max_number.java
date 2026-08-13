import java.util.Scanner;

public class Max_number {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int size = input.nextInt();
    int [] arr = new int[size];
    int index = 0;
    while(index < size){
      System.out.print("please enter your number: " + (index+1) + ": ");
      arr[index] = input.nextInt();
      index++;
    }
    int max = Integer.MIN_VALUE;
    for(int num : arr){
      if(max < num){
        max = num;
      }
    }
    System.out.println("Maximum number is: " + max);
  }
}
