class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        ArrayList<Integer> l=new ArrayList<>();
        for(int i:nums){
            l.add(i);
        }
        for(int i=0;i<n;i++){
            nums[i]=l.get((n-k+i)%n);
        }
        
    }
}