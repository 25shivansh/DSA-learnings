public class subarrays {
    static void printsubarrays(int number[]){
        int n=number.length;
        int ts=0;
        for(int i=0;i<n;i++){//START
            int start=i;
            for(int j=i;j<n;j++){//END
                int end=j;
                for(int k=start;k<=end;k++){//PRINT
                    System.out.print(number[k]+" ");

                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("TOTAL SUBARRAYS:"+ts);

    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        printsubarrays(number);
    }
}
