class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> sk=new Stack<>();
        StringBuilder sb=new StringBuilder();
        String a="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                sk.push(ch);
                a=a+ch;
            }
            else{
                if(sk.peek()=='('){
                    sk.pop();
                    if(sk.isEmpty()){
                        sb.append(a.substring(1));
                        a="";
                    }
                    else{
                        a=a+ch;
                    }
                }
            }
        }
        return sb.toString();
    }
}