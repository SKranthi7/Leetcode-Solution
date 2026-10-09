class Solution {
    void merge(int[] nums,int l, int r){
        if(l<r){
            int mid=(l+r)/2;
            merge(nums,l,mid);
            merge(nums,mid+1,r);
            
            mergesort(nums,l,mid,r);
        }
    }
    void mergesort(int[] nums,int l,int mid,int r){
        int i=l;
        int[] temp=new int[r-l+1];
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=r){
            if(nums[i]<=nums[j]){
                temp[k++]=nums[i++];
            }
            else{
                temp[k++]=nums[j++];
            }
        }
        while(i<=mid){
            temp[k++]=nums[i++];
        }
        while(j<=r){
            temp[k++]=nums[j++];
        }
        for(int x=0;x<temp.length;x++){
            nums[l+x]=temp[x];
        }
    }
    public int[] sortArray(int[] nums) {
        merge(nums,0,nums.length-1);
        return nums;
    }
}