class Solution {
    List<String> ans;
    boolean check(String s){
        int b=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                b++;
            }
            else if(ch==')'){
                b--;
            }
            if(b<0){
                return false;
            }
        }
        return b==0;
    }
    void rec(String s,int i,String a,int left,int right){
        if(i==s.length()){
            if(left==0&& right==0&&check(a)){
                ans.add(a);
            }
            return;
        }
        char ch=s.charAt(i);
        if(ch=='('&&left>0){
            rec(s,i+1,a,left-1,right);
        }
        if(ch==')'&&right>0){
            rec(s,i+1,a,left,right-1);
        }
        rec(s,i+1,a+ch,left,right);
        
    }
    public List<String> removeInvalidParentheses(String s) {
        ans=new ArrayList<>();
         int left = 0;
        int right = 0;

       
        for(char ch : s.toCharArray()){
            if(ch == '('){
                left++;
            }
            else if(ch == ')'){
                if(left > 0){
                    left--;
                }
                else{
                    right++;
                }
            }
        }

        rec(s,0,"",left,right);
        
        return new ArrayList<>(new HashSet<>(ans));
    }
}