class Solution {
    public boolean hasDuplicate(int[] nums) {
        int tableSize=nums.length*2;
        Integer table[]=new Integer[tableSize];

        for(int num:nums){
            int idx=Math.abs(num)%tableSize;
            while(table[idx]!=null){
                if(table[idx]==num){
                    return true;
                }
                idx=(idx+1)%tableSize;
            }
            table[idx]=num;
        }
        return false;
    }
}