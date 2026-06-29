class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for(int num:map.keySet()){
            q.add(num);
            if(q.size()>k){
                q.poll();
            }
        }
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=q.poll();
        }

        return res;
    }
}
