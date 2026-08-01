import java.util.Scanner;

public class Multiplication {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int number = input.nextInt();
    multiplication(number);
    input.close();
  }
  public static void multiplication(int num){
    int i = 1;
    while(i <= 10){
      int number = i*num;
      System.out.println(num + "X" + i + "=" + (number));
      i++;
    }
  }
}
