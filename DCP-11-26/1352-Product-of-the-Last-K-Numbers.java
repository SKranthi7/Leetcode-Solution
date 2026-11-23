class ProductOfNumbers {
    ArrayList<Integer> l;
    public ProductOfNumbers() {
        l=new ArrayList<>();

    }
    
    public void add(int num) {
        l.add(num);    
    }
    
    public int getProduct(int k) {
        int p=1;
        for(int i=l.size()-k;i<l.size();i++){
            p*=l.get(i);
        }
        return p;
    }
}

