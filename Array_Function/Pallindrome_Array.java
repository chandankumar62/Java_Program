import java.util.Scanner;

public class Pallindrome_Array {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("ENter your number: ");
    int size = input.nextInt();
    int [] arr = new int[size];
    int index = 0;
    while(index< size){
      System.out.print("Enter your element number " + (index+1) + ": ");
      arr[index] = input.nextInt();
      index++;
    }
    boolean isPalin = isPalindrome(arr);
    if(isPalin){
      System.out.println("your number is palindrome");
    }else{
      System.out.println("Your number is not palindrome");
    }
  }
  public static boolean isPalindrome(int[] numArr){
    int i = 0;
    while(i < numArr.length / 2){
      if(numArr[i] != numArr[numArr.length - 1 - i]){
        return false;
      }
      i++;
    }
    return true;
  }
}
