class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int max=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i: nums){
            
                set.add(i);
            
        }
        for(int x:set){
            if(!set.contains(x-1)){
                int c=0;
                while(set.contains(x)){
                    x++;
                    c++;
                }
                max=Math.max(max,c);
            }
        }
        return max;
    }
}