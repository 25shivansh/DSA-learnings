public class maxsubarray {
    static void maxprintsubarraysum(int number[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int n=number.length;
        for(int i=0;i<n;i++){//START
            int start=i;
            for(int j=i;j<n;j++){//END
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++){//PRINT
                    //subarray sum
                    currsum+=number[k];

                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }

            }

        }
        System.out.println("MAX SUM:"+maxsum);

    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        maxprintsubarraysum(number);
    }
}
