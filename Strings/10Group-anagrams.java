
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

   Map<String, List<String>> map = new HashMap<>();
        
        for(int i = 0;i<strs.length;i++){
            String temp = sortString(strs[i]);
            if(!map.containsKey(temp)){
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(temp,list);
            }else{
                map.get(temp).add(strs[i]);
            }
        }

         List<List<String>> list = new ArrayList<>();
        for(List<String> trs : map.values()){
            list.add(trs);
        }
        return list;

    }
  public static String sortString(String s){
        char a[] = s.toCharArray(); Arrays.sort(a);
       return new String(a);
    } 
}
