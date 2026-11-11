class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long cos1=cost1;
        long cos2=cost2;
        long nee1=need1;long nee2=need2;
        long cosBoth=costBoth;
        long pair=Math.min(nee1,nee2);
        long costp=pair*(Math.min(cosBoth,cos1+cos2));
        long n1=nee1-pair;
        long n2=nee2 -pair;
        long cr=n1*Math.min(cos1,cosBoth)+n2*Math.min(cos2,cosBoth);
        return costp+cr;
    }
}