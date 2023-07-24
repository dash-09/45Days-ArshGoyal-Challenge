// code is here


class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
       
       // this is the question based on sliding window .  the size of window is the size of students given . You will only recognise this after sorting the array 
       
       Collections.sort(a);
       int min = 0, max = m-1, mindiff = 0, diff = Integer.MAX_VALUE;
       
       while(max<n){
           mindiff = a.get(max)-a.get(min);
           if(mindiff<diff){
               diff = mindiff;
           }
           ++min;
           ++max;
       }
       return diff;
       
    }
}
