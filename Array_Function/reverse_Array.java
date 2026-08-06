import java.util.Scanner;

public class reverse_Array {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int size = input.nextInt();
    int[] arr = new int[size];
    int index = 0;
    while(index < size){
      System.out.print("Please enter your element number " + (index+1) +": ");
      arr[index] = input.nextInt();
      index++;
    }
    reverse(arr);
    System.out.println("Your reversed array is");
    displayArray(arr);
  }
  public static void displayArray(int[] numArray){
    int i = 0;
    while(i < numArray.length){
      System.out.print(numArray[i] + " ");
      i++;
    }
    System.out.println();
  }
  public static void reverse(int[] arr){
    int i = 0;
    while(i < arr.length / 2){
      int swap = arr[i];
      arr[i] = arr[(arr.length - 1) - i];
      arr[(arr.length - 1) - i]  = swap;
      i++;
    }
  }
}
