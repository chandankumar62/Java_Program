import java.util.Scanner;

public class inputArray{
  public static int[] input(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int size = input.nextInt();
    int [] arr = new int[size];
    int index = 0;
    while(index < size){
      System.out.print("Please enter your element number " + (index + 1) + ": ");
      arr[index] = input.nextInt();
      index++;
    }
    return arr;
  }
  public static int[][] input2DArray(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int rows = input.nextInt();
    System.out.print("Enter the number of colum: ");
    int colum = input.nextInt();
    int[] [] arr = new int[rows][colum];
    int index = 0;
    while(index < rows){
      int j = 0;
      while(j < colum){
        System.out.print("Please enter your element rows " + (index + 1) + ", column: "+ (j+1) + " : ");
        arr[index][j] = input.nextInt();
        j++;
      }
      
      index++;
    }
    return arr;
  }
}