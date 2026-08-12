import java.util.Scanner;

public class passwordChecker {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String password;    
    do{
      System.out.print("enter your correct password : ");
      password = input.next();
    }while(!isValidPassword(password));
    System.out.println("Thanks for entering a valid password");
  }
  public static boolean isValidPassword(String password){

    return password.length() > 6;
  }
}
