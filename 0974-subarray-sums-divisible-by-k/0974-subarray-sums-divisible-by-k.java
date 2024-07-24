class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int cumSum=0,rem, res=0;
        int remFreq[]=new int[k];
        remFreq[0]=1;
        for(int num : nums){
            cumSum+=num;
            rem=cumSum%k;
            rem= rem<0? rem+k:rem;
            res+=remFreq[rem];
            remFreq[rem]++;
        }

        return res;
        
    }
}