class Solution {
    public long maxAlternatingSum(int[] nums) {
        
        
        long ans=0;
        long[] a=new long[nums.length];
        for(int x=0;x<nums.length;x++){
            a[x]=nums[x]*nums[x];
        }
        Arrays.sort(a);
        int k=nums.length/2;
        for(int i=0;i<k;i++){
            ans-=a[i];
        }
        for(int i=k;i<nums.length;i++){
            ans+=a[i];
        }
        return ans;
    }
}