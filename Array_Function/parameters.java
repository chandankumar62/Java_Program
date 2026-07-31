public class parameters {
  public static void main(String[] args) {
    System.out.print(sumTwoNumber(3,5));
  }
  public static int sumTwoNumber(int first, int second){
    System.out.println("your first number: " + first);
    System.out.println("your second number: " + second);
    int sum = first + second;
    return sum;
  }
}
