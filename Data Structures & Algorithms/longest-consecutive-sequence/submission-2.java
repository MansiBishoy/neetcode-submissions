class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> map=new HashSet<>();
        
        for(int num:nums){// adding nums in the set
            map.add(num);
        }
        int longestStreak=0;
        for(int num:map){//iterating through the set
            if(!map.contains(num-1)){// if num is the first number
                int currentNum=num;
                int currentStreak=1;
            
            while(map.contains(currentNum+1)){
                currentNum++;
                currentStreak++;
            }
            longestStreak=Math.max(longestStreak,currentStreak);
        }
        }
      return longestStreak;  
    }
}
