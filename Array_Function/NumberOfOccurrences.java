import java.util.Scanner;

public class NumberOfOccurrences {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int size = input.nextInt();
    int[] numArr = new int[size];
    int index = 0;
    while(index < size){
      System.out.print("Please enter your number " + (index+1) + ":");
      numArr[index] = input.nextInt();
      index++;
    }
    System.out.print("Now enter the umber you want to find: ");
    int num2 = input.nextInt();
    int Occurrences = noOfOccurrences(numArr, num2);
    System.out.println("Your element was found " + Occurrences + " times in the array");
  }
  public static int noOfOccurrences(int[] numArr, int num){
    int occ = 0;
    int i = 0;
    while(i < numArr.length){
      if(numArr[i] == num){
        occ++;
      }
      i++;
    }
    return occ;
  }
}
