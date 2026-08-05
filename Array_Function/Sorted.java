import java.util.Scanner;

public class Sorted {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("ENter your number: ");
    int size = input.nextInt();
    int [] arr = new int[size];
    int index = 0;
    while(index < size){
      System.out.print("Please enter element number" + (index+1) + ": ");
      arr[index] = input.nextInt();
      index++;
    }
    boolean isInc = isIncreasing(arr);
    boolean isDec = isDecreasing(arr);
    if(isDec || isInc){
      System.out.println("Array is sorted");
    }else{
      System.out.println("Array is not sorted");
    }

  }
  public static boolean isIncreasing(int[] num) {
    int i = 1;
    while( i < num.length){
      if(num[i] < num[i-1]){
        return false;
      }
      i++;
    }
    return true;
  }
  public static boolean isDecreasing(int[] num) {
    int i = 1;
    while(i < num.length){
      if(num[i] > num[i-1]){
        return false;
      }
      i++;
    }
    return true;
  }
}
