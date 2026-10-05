class Solution {
    public int scoreOfParentheses(String s) {
        //Stack<Character> sk=new Stack<>();
        int c=0;
        boolean b=true;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                b=true;
                c++;
            }
            else{
                if(b){
                    ans+=Math.pow(2,c-1);
                    b=false;
                    
                }
                c--;
            }
        }
        ans+=Math.pow(2,c-1);
        return ans;
    }
}