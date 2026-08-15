import java.util.Scanner;

public class palindromeRecursion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your umber : ");
    String num = input.next();
    System.out.println("Your number is " + (isPalindrome(num) ? "pallindrome" : "Not pallindrome"));
    input.close();
  }
  public static boolean isPalindrome(String str){
    if(str.length() <=1){
      return true;
    }
    int lastPos = str.length() - 1;
    if(str.charAt(0) != str.charAt(lastPos)){
      return false;
    }
    String newStr = str.substring(1 , lastPos);
    return isPalindrome(newStr);
  }
}
