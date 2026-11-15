class Solution {
    public int numOfSubarrays(int[] arr) {
        int c=0;
        int even=1;
        int odd=0;
        int ans=0;
        int[] p=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            c+=arr[i];
           if(c%2!=0){
            ans+=even;
            odd++;
           }
           else{
            ans+=odd;
            even++;
           }
           ans=ans%1000000007;
        }
        return ans;
    }
}