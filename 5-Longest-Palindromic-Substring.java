class Solution {
    public String longestPalindrome(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
            int p1=i,p2=i;
            while(p1>=0&&p2<s.length()){
                if(s.charAt(p1)==s.charAt(p2)){
                    String ans=s.substring(p1,p2+1);
                    p1--;
                    p2++;
                    if(ans.length()>res.length()){
                        res=ans;
                    }
                }
                else{
                    break;
                }
            }
            p1=i;
            p2=i+1;
            while(p1>=0&&p2<s.length()){
                if(s.charAt(p1)==s.charAt(p2)){
                    String ans=s.substring(p1,p2+1);
                    p1--;
                    p2++;
                    if(ans.length()>res.length()){
                        res=ans;
                    }
                }
                else{
                    break;
                }
            }
        }
        return res;
    }
}