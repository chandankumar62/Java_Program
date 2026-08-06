import java.util.Scanner;

public class delete {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int size = input.nextInt();
    int[] arr = new int[size];
    int index = 0;
    while(index < size){
      System.out.print("Please enter your element number " + (index+1) + ": ");

      arr[index] = input.nextInt();
      index++;
    }
    System.out.print("Now, enter then number you want to delete: ");
    int numToDelete = input.nextInt();
    int[] newArr = deleteNumber(arr, numToDelete);
    System.out.println("Hete is your new array");
    displayArray(newArr);
  }
  public static void displayArray(int[] numArray){
    int i = 0;
    while(i < numArray.length){
      System.out.print(numArray[i] + " ");
      i++;
    }
    System.out.println();
  }
  public static int[] deleteNumber(int[] numArr, int numToDelete){
    int occ = NumberOfOccurrences.noOfOccurrences(numArr, numToDelete);
    if(occ == 0){
      return numArr;
    }
    int newSize = numArr.length - occ;
    int [] newArr = new int[newSize];
    int i = 0, j = 0;
    while(i < numArr.length){
      if(numArr[i] != numToDelete){
        newArr[j] = numArr[i];
        j++;
      }
      i++;
    }

    return newArr;
  }
}
