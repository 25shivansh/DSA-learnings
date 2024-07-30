public class pairsinanarray{
    static void pairarray(int number[]){
        int n=number.length;
        int tp=0;
        for(int i=0;i<n;i++){
            int curr=number[i];//2 4 6 8 10
            for(int j=i+1;j<n;j++){
                System.out.print("("+curr+","+number[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("TOTAL PAIRS:"+tp);
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        pairarray(number);
    }
}
