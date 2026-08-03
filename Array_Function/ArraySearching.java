import java.util.Scanner;

public class ArraySearching {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int [] arr = {23,54,33,52,26};
    System.out.print("Enter your number you want to search: ");
    int num = input.nextInt();
    boolean isArray = isArray(arr, num);
    if(isArray){
      System.out.println("Sucessfully surch you number");
    }else{
      System.out.println("UnSucessfully surch you number");
    }
  }
  public static boolean isArray(int[] arr, int num){
    int index = 0;
    while(index < arr.length){
      if(num == arr[index]){
        return true;
      }
      index++;
    }
    return false;
  }
}
