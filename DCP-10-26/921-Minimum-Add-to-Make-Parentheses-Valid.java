class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> sk=new Stack<>();
        int r=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                sk.push(ch);
            }
            else{
                if(sk.isEmpty()){
                    r++;
                }
                else if(sk.peek()=='('){
                    sk.pop();
                }
            }
        }
        return r+sk.size();
    }
}