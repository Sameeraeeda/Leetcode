class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int a:stones){
            maxHeap.add(a);
        }
        while(maxHeap.size()>1){
            int first=maxHeap.poll();
            int last=maxHeap.poll();
            if(first!=last){
                maxHeap.add(first-last);
            }
        }
        if(maxHeap.size()==0){
            return 0;
        }
        return maxHeap.poll();
    }
}