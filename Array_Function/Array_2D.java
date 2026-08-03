public class Array_2D {
  public static void main(String[] args) {
    int [][] arr = new int[2][3];
    int [][] myArr = {{1,2,3},{4,5},{6,7,8}};
    int i = 0;
    while( i < myArr.length){
      int j = 0;
      while(j < myArr[i].length){
        System.out.print(myArr[i][j] + " ");
        j++;
      }
      System.out.println();
      i++;
    }
  }
}
