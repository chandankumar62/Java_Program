public class tempCodeRunnerFile{
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