class ProductOfNumbers {
    
    List<Integer> list;
    int product;
    public ProductOfNumbers() {
        list=new ArrayList<>();
        product=1;
    }
    
    public void add(int num) {
         if(num==0){
             list.clear();
             product=1;
         }
        else{
            product=product*num;
            list.add(product);
        }
    }
    
    public int getProduct(int k) {
        k=list.size()-k;
        if(k==0){
            return product;
        }
        else if(k>0){
            return product/list.get(k-1);
        }
        return 0;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */