import java.util.Scanner;

public class Sum_Positive_number {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int size = input.nextInt();
    int[] numArr = new int[size];
    int index = 0;
    while(index < size){
      System.out.print("Please enter your number " + (index+1) + " : ");
      numArr[index] = input.nextInt();
      index++;
    }
    input.close();
    int sum = 0;
    for(int num : numArr){
      if(num < 0){
        continue;
      }
      sum += num;
    }
    System.out.println("The sum of all positive number is : " + sum);
  }
}
