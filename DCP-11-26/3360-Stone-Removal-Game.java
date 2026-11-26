class Solution {
    public boolean canAliceWin(int n) {
        int stone=10;
        boolean win=false;
        while(n>=stone){
            n=n-stone;
            stone--;
            win=(win==true)?false:true;
        }
        return win;
    }
}