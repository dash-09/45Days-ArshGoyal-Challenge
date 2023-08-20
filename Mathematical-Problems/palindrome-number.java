
// return true if the given number is palindrome .
class solution{
  public static boolean palindrome(int x){
    if(x%10==0 || x<0 ){return false;}
    int temp=z;
    int res = 0;
    while(temp!=0){
      int rem = temp%10;
      temp = temp/10;
      res = res*10 + rem;
    }
    return x==res;
    
  }    
}
