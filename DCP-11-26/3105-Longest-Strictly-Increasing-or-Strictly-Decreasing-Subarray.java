class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=1;
        for(int i=1;i<nums.length;i++){
            int inc=1;
            int dec=1;
            for(int j=i;j<nums.length;j++){
                if(nums[j-1]<nums[j]){
                    inc++;
                    dec=1;
                }
                else if(nums[j-1]>nums[j]){
                    inc=1;
                    dec++;
                }
                else{
                    inc=1;
                    dec=1;
                    
                }
                max=Math.max(max,Math.max(inc,dec));
            }          
        }
        return max;
    }
    
}