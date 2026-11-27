class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n=items.length;
        int[] gain=new int[n];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int factor=items[i][0];
            int price=items[i][1];
            min=Math.min(min,price);
            int bonus=0;
            for(int j=0;j<n;j++){
                if(i==j)
                    continue;
                int factorj=items[j][0];
                if(factorj%factor==0){
                    bonus++;
                }
            }
             gain[i]=bonus+1;
        }
       
        int[] dp=new int[budget+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        for(int i=0;i<n;i++){
            int cost=items[i][1];
            for(int b=budget;b>=cost;b--){
                if(dp[b-cost]!=-1){
                    dp[b]=Math.max(dp[b],dp[b-cost]+gain[i]);
                }
            }
        }
        int ans=0;
        for(int spent=0;spent<=budget;spent++){
            if(dp[spent]==-1)
                continue;
            ans=Math.max(ans,dp[spent]+(budget-spent)/min);
        }
        return ans;
    }
}