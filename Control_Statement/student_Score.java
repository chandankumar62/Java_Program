import java.util.Scanner;

public class student_Score {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int marks = input.nextInt();
    input.close();
    String category = marks > 80 ? "High" : (marks > 50 ? "Moderate" : "Low");
    System.out.println("Your category is: " + category);
  }
}
