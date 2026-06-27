class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            int count[]=new int[26];
            for(char c:str.toCharArray()){
                count[c-'a']++;
            }
        
        StringBuilder key1=new StringBuilder();
        for(int val:count){
            key1.append('#');
            key1.append(val);
        }
        String key2 = key1.toString();
        if(!map.containsKey(key2)){
            map.put(key2,new ArrayList<>());
        }
        map.get(key2).add(str);
    }
    return new ArrayList<>(map.values());
    }
}
