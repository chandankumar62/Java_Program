import java.util.Scanner;

public class Searching_Number {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int size = input.nextInt();
    int [] arr = new int[size];
    int index = 0;
    while(index < size){
      System.out.print("Please enter your number " + (index+1) + " : ");
      arr[index] = input.nextInt();
      index++;
    }
    System.out.print("Enter your searching number: ");
    int element = input.nextInt();
    int occ = countOccurencess(arr, element);
    System.out.println("Your number is present "+ occ + " times");
    input.close();
  }
  public static int countOccurencess(int[] nums , int element){
    int occ = 0;
    for(int num : nums){
      if(num == element){
        occ++;
      }
    }
    return occ;
  }
}
