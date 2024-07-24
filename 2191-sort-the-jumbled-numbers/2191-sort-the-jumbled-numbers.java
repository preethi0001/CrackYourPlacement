class Solution {
    private int map(int num, int[] mapping){
        if(num<mapping.length) return mapping[num];
        StringBuilder ans =new StringBuilder();
        int i=0;
        String n=String.valueOf(num);
        while(i<n.length()){
            ans.append(mapping[n.charAt(i++)-'0']);
        }
        return Integer.parseInt(ans.toString());
    }
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int mp[][]=new int[nums.length][2];
        int i=0;
        for(int num:nums){
            int mapVal=map(num, mapping);
            mp[i][0]=num;
            mp[i][1]=mapVal;
            i++;
        }

        Arrays.sort(mp,(a,b)-> a[1]-b[1]);
        
        i=0;
        for(int m[]:mp){
            nums[i++]=m[0];
        }
        return nums;
    }
}