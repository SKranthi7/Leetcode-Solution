class Solution {
    public int minInsertions(String s) {
        Stack<Character> sk=new Stack<>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                sk.push(ch);
            }
            else{
                
                    if(i+1<s.length()&&s.charAt(i+1)==')'){
                        i++;
                    }
                    else{
                        ans++;
                    }
                
                    if(!sk.isEmpty()){
                        sk.pop();
                    }
                    else{
                        ans++;
                    }
            }

        }
        return sk.size()*2+ans;
    }
}