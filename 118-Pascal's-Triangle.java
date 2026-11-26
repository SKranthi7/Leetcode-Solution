class Solution {
    List<List<Integer>> ans;
    void func(int nums,int r){
        if(r==nums){
            return;
        }
        List<Integer> l=new ArrayList<>();
        if(r==0){
            l.add(1);
            ans.add(l);
            func(nums,r+1);
        }
        else if(r==1){
            l.add(1);
            l.add(1);
            ans.add(l);
            func(nums,r+1);
        }
        else{
            List<Integer> a=ans.get(ans.size()-1);
            l.add(1);
            for(int i=0;i<a.size()-1;i++){
                l.add(a.get(i)+a.get(i+1));
            }
            l.add(1);
            ans.add(l);
            func(nums,r+1);
        }
    }
    public List<List<Integer>> generate(int numRows) {
        ans=new ArrayList<>();
        func(numRows,0);
        return ans;
    }
}