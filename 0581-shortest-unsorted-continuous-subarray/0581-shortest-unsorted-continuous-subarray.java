class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int start = -1;
        int end = -2;
        for(int i=0;i<n;i++){
            max = Math.max(max , nums[i]);
            if(nums[i]<max){
                end = i;
            }
        }
        for(int i = n-1; i>=0 ; i--){
            min = Math.min(min , nums[i]);
            if(nums[i]>min){
                start = i;

            }
                 
        }
        return end-start+1;
    }
}