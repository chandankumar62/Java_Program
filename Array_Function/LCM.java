import java.util.Scanner;

public class LCM {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.print("Enter your number: ");
   int first = input.nextInt();
   System.out.print("Enter your number: ");
   int second = input.nextInt();
   int lcm = LcmOfTwoNumber(first, second);
   System.out.println("LCM of the two number: " + lcm);
   input.close();
  }
  public static int LcmOfTwoNumber(int first , int second) {
    int i = 1;
    while(i <= second){
      int factor = first * i;
      if(factor % second ==0){
        return factor;
      }
      i++;
    }
    return 0;
  }
  
}
