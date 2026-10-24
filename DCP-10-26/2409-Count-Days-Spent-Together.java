class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int as=inDay(arriveAlice,days);
        int ae=inDay(leaveAlice,days);
        int bs=inDay(arriveBob,days);
        int be=inDay(leaveBob,days);
        System.out.println(as+" "+ae+" "+bs+" "+be+" ");
        int start=Math.max(as,bs);
        int end=Math.min(ae,be);
        int result=Math.max(0,end-start+1);
        return result;
        
    }
    int inDay(String s,int[] days){
        int m=(s.charAt(0)-'0')*10+(s.charAt(1)-'0');
        int d=(s.charAt(3)-'0')*10+(s.charAt(4)-'0');
        int  res=d;
        for(int i=0;i<m-1;i++){
            res+=days[i];
        }
        return res;
    }
}