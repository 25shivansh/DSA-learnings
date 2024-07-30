public class question3 {
    static int buyandsellstock(int prices[]){
        int buyprices=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if ( buyprices < prices[i] ){
                int profit=prices[i]-buyprices;
                maxprofit=Math.max(maxprofit,profit);

            }else{
                buyprices=prices[i];
            }

        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[]={7,6,4,3,2,1};
        System.out.println(buyandsellstock(prices));

    }
}
