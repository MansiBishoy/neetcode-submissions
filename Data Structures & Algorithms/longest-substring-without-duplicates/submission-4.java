class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int result=0;
        HashSet <Character> seen= new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            result=Math.max(result,right-left+1);
        }
        return result;
    }
}
