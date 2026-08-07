public class Digonal {
  public static void main(String[] args) {
    int[][] numArr = inputArray.input2DArray();
    long sum = SumOfDigonal(numArr);
    System.out.println("Sum of digonal is : " + sum);
  }
  public static long SumOfDigonal(int[][] numArr){
    long leftSum = SumOfLeftDigonal(numArr);
    long rightSum = SumOfRightDigonal(numArr);
    long sum = leftSum + rightSum;
    if(numArr.length % 2 != 0){
      int ind = numArr.length / 2;
      sum -= numArr[ind][ind];
    }
    return sum;
  }
  public static long SumOfLeftDigonal(int[][] numArr){
    long sum = 0;
    int i = 0;
    while (i < numArr.length){
      sum += numArr[i][i];
      i++;
    }
    return sum;
  }
  public static long SumOfRightDigonal(int[][] numArr){
    long sum = 0;
    int i = 0;
    while(i < numArr.length){
      int col = numArr.length - 1 - i;
      sum += numArr[i][col];
      i++;
    }
    return sum;
  }
}
