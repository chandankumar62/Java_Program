import java.util.Scanner;

public class pattern {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int num = input.nextInt();
    pattern(num);
    reverseRightPyramid(num);
    reverseLeftPyramid(num);
  }
  public static void reverseRightPyramid(int num) {
    int rows = num;
    while (rows >= 0){
      System.out.print("*");
      int i = 0;
      while(i < rows){
        System.out.print(" *");
        i++;
      }
      System.out.println();
      rows--;
    }
  }
  public static void reverseLeftPyramid(int num) {
    int rows = num;
    while (rows >= 0){
      int j = 0;
      while(j < rows){
        System.out.print(" ");
        j++;
      }
      int i = 0;
      while(i <= (num - rows)){
        System.out.print(" *");
        i++;
      }
      System.out.println();
      rows--;
    }
  }
  public static void pattern(int num){
    int rows = 0;
    while(rows <= num){
      System.out.print("*");
      int i = 0;
      while(i < rows){
        System.out.print(" *");
        i++;
      }
      System.out.println();
      rows++;
    }
  }
}
