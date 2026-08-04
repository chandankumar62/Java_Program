import java.util.Scanner;

public class Max_min {
  public static void main(String[] args) {
    System.out.println("Welcome to min and max\n");
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int size = input.nextInt();
    int [] arr = new int[size];
    int index = 0;
    while(index < size){
      System.out.println("Please enter your number " + (index+1) + ": ");
      arr[index] = input.nextInt();
      index++;
    }
    
    int max = max(arr);
    int min = min(arr);
    System.out.println("Max number is :" + max);
    System.out.println("Min number is: " + min);
  }
  public static int min(int[] arr){
    int min = Integer.MAX_VALUE;
    int i = 0;
    while(i < arr.length){
      if(min > arr[i]){
        min = arr[i];
      }
      i++;
    }
    return min;
  }
  public static int max(int[] arr){
    if(arr.length == 0){
      return Integer.MIN_VALUE;
    }
    int max = arr[0];
    int i = 1;
    while(i < arr.length){
      if(max < arr[i]){
        max = arr[i];
      }
      i++;
    }
    return max;
  }
}
