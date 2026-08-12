import java.util.Scanner;

public class GussNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double num = (Math.random()* 100) + 1 , guss;
    do{
      System.out.print("Enter your number: ");
      guss = input.nextInt();
    }while(num != guss);
    System.out.println("You correct guss number");
  }
}
