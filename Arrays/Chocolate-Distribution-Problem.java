 
/* see the explanationn
N = 8, M = 5
A = {3, 4, 1, 9, 56, 7, 9, 12}
Output: 6
Explanation: The minimum difference between maximum chocolates and minimum chocolates is 9 - 3 = 6 by choosing following M packets :{3, 4, 9, 7, 9}.
*/ 

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
