class Solution {
    public String[] createGrid(int m, int n) {
        StringBuilder sb=new StringBuilder();
        String[] a=new String[m];
        for(int i=0;i<n;i++){
            sb.append(".");
        }
        a[0]=sb.toString();
        for(int i=1;i<m;i++){
            StringBuilder sb1=new StringBuilder();
            for(int j=0;j<n-1;j++){
                sb1.append("#");
            }
            sb1.append(".");
            a[i]=sb1.toString();
        }
        return a;
        
    }
}