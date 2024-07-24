class Solution {
    public int[] frequencySort(int[] nums) {
        
        Map<Integer, Integer> freqMap=new HashMap<>();
        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]
        );

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            pq.offer(new int[]{entry.getKey(), entry.getValue()});
        }

        int index = 0;
        while (!pq.isEmpty()) {
            int[] entry = pq.poll();
            int value = entry[0];
            int frequency = entry[1];
            for (int i = 0; i < frequency; i++) {
                nums[index++] = value;
            }
        }
        
        return nums;
    }
}