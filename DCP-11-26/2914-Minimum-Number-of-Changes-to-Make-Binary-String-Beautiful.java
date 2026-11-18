class Solution {
    public int minChanges(String s) {
        int c=0;
        int start=0;
        for(int i=2;i<s.length();i+=2){
            String sub=s.substring(start,i);
            System.out.println(sub);
            if(!sub.equals("11")&&!sub.equals("00")){
                 c++;
            }
            start=i;
        }
        String sub=s.substring(s.length()-2,s.length());
            System.out.println(sub);
            if(!sub.equals("11")&&!sub.equals("00")){
                 c++;
            }
        return c;
    }

}