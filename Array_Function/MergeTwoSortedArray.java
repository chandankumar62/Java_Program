public class MergeTwoSortedArray {
  public static void main(String[] args) {
    int [] arr1 = inputArray.input();
    int [] arr2 = inputArray.input();
    int [] mergdArr = merge(arr1, arr2);
    System.out.println("Your merged array is : ");
    displayArray(mergdArr);
  }
  public static void displayArray(int[] numArray){
    int i = 0;
    while(i < numArray.length){
      System.out.print(numArray[i] + " ");
      i++;
    }
    System.out.println();
  }
  public static int[] merge(int[] arr1, int[] arr2){
    int newSize = arr1.length + arr2.length;
    int[] newArr = new int[newSize];
    int i = 0, j = 0, k = 0;
    while(i < arr1.length || j < arr2.length){
      if(j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])){
        newArr[k] = arr1[i];
        i++;
        k++;
      }else{
        newArr[k] = arr2[j];
        k++;
        j++;
      }
    }
    return newArr;
  }
}
