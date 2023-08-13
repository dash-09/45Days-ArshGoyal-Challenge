//  this is algo that tells in order to rotate the image you have to do two things >> 1) transpose and 2) row-reverse .
// grid has the size of N*N .
class solution{
   public void rotateImage(int matrix[][]){
      transpose(matrix);
      rowReverse(matrix);
   }
  public static void transpose(int matrix[][]){
    int n = matrix.length;
    for(int i = 0;i<n;i++){
     for(int j = 0;j<i;j++){      
       int temp = matrix[i][j] ;
       matrix[i][j] = matrix[j][i];
       matrix[j][i] = temp;
     }
    }
  }
  public static void rowReverse(int matrix[][]){
    int n = matrix.length;
    for(int i = 0;i<n;i++){
     int left = 0;
      int right = matrix.length-1;
      while(left<right){
        int temp = matrix[i][left];
        matrix[i][left] = matrix[i][right];
        matrix[i][right] = temp;
        left++;
        right--;
      }
    }
  }
}
