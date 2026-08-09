import java.util.Scanner;

public class Year {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your year number: ");
    int year = input.nextInt();
    input.close();
    String YearStr = switch(year){
      case 1 -> "January";
      case 2 -> "February";
      case 3 -> "March";
      default -> "invalid number";
    };
    System.out.println(YearStr);
  }
}
