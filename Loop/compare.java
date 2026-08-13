import java.util.Scanner;

public class compare {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    while (true){
      System.out.print("Enter your word : ");
      String command = input.next();
      if(command.equals("exit")){
        break;
      }
    }
    System.out.println("Your command is equal");
  }
}
