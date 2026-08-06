import java.util.Scanner;

public class inputArray{
  public static int[] input(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int size = input.nextInt();
    int [] arr = new int[size];
    int index = 0;
    while(index < size){
      System.out.print("Please enter your element number " + (index + 1) + ": ");
      arr[index] = input.nextInt();
      index++;
    }
    return arr;
  }
}