class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        
        if(arr== null || arr.length == 0 || k>arr.length) return 0;

        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        PriorityQueue<Integer> pq= new PriorityQueue<>(map.values());
        while(k>0){
            k-=pq.poll();
        }
        return k<0 ? pq.size()+1 : pq.size();
    }
}
