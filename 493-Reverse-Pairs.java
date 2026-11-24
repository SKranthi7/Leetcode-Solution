class Solution {
    int count=0;
    void merge(int[] nums,int l,int r){
        if(l>=r){
            return;
        }
        int mid=(l+r)/2;
        merge(nums,l,mid);
        merge(nums,mid+1,r);
        int j=mid+1;
        for(int i=l;i<=mid;i++){
            while(j<=r&&(long)nums[i]>2L*nums[j]){
                j++;
            }
            count+=j-(mid+1);
        }
        mergeSort(nums,l,mid,r);
    }
    void mergeSort(int[] nums,int l,int mid,int r){
        ArrayList<Integer> t=new ArrayList<>();
        int i=l;
        int j=mid+1;
        while(i<=mid&&j<=r){
            if(nums[i]<=nums[j]){
                t.add(nums[i++]);
            }
            else{
                t.add(nums[j++]);
            }
        }
        while(i<=mid){
            t.add(nums[i++]);
        }
        while(j<=r){
            t.add(nums[j++]);
        }
        for(int k=l;k<=r;k++){
            nums[k]=t.get(k-l);
        }
    }
    public int reversePairs(int[] nums) {
        merge(nums,0,nums.length-1);
        return count;
    }
}