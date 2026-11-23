class ProductOfNumbers {
    ArrayList<Integer> l;
    int p;
    public ProductOfNumbers() {
        l=new ArrayList<>();
        l.add(1);
         p=1;
    }
    
    public void add(int num) {
        if(num!=0){
            p*=num;
            l.add(p);
        }
        else{
            l.clear();
            l.add(1);
            p=1;
        }
    }
    
    public int getProduct(int k) {
       if(k>=l.size()){
        return 0;
       }
        return l.get(l.size()-1)/l.get(l.size()-k-1);
    }
}

