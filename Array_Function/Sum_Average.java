import java.util.Scanner;

public class Sum_Average {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int size = input.nextInt();
    int [] num = new int[size];
    int index =  0;
    while(index < size){
      System.out.print("Please enter element no " + (index+1) + ":");
      num[index] = input.nextInt();
      index++;
    }
    long sum = sum(num);
    int Average = Average(num);
    System.out.println("Sun of the number is: " + sum);
    System.out.println("Average of the number: " + Average);
  }
  public static long sum(int [] num){
    long sum = 0;
    int i = 0;
    while(i < num.length){
      sum += num[i];
      i++;
    }
    return sum;
  }
  public static int Average(int[] num){
    long sum = sum(num);
    return (int)(sum/num.length);
  }
}
