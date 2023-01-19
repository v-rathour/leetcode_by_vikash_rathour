class Lexicographical_Numbers{
     List<Integer> list=new ArrayList<>();
    public List<Integer> lexicalOrder(int n) {
        print_Lexographical(n,0);
        return list;
    }
    void print_Lexographical(int num,int n){
        if(n>num){
            return;
        }
        if(n!=0)
          list.add(n);
        int i = 0;
        if(n==0){
            i=1;
        }
        for (; i <= 9; i++) {
            print_Lexographical(num,n*10+i);
        }
    }
}
