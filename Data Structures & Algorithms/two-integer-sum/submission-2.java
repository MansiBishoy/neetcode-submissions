class Solution {
    public int[] twoSum(int[] nums, int target) {
        int tableSize=nums.length*2;
        Integer key[]=new Integer[tableSize];
        Integer val[]=new Integer[tableSize];
        
        for(int i=0;i<nums.length;i++){
            int currentNum=nums[i];
            int diff=target-currentNum;

            int idx=Math.abs(diff)%tableSize;
            while(key[idx]!=null){
                if(key[idx]==diff){
                    return new int[]{val[idx],i};
                }
                idx=Math.abs(idx+1)%tableSize;
            }
            int idx2=Math.abs(currentNum)%tableSize;
            while(key[idx2]!=null){
                if(key[idx2]==currentNum){
                    break;
                }
                idx2=Math.abs(idx2+1)%tableSize;
            }
                key[idx2]=currentNum;
                val[idx2]=i;

            }
            return new int[]{};
        }
    }

