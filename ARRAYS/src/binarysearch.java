public class binarysearch {
    static int search(int number[],int key){
        int n=number.length;
        int st=0,end=n-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(key==number[mid]){//found
                return mid;
            } else if (key<number[mid]) {//left
                end=mid-1;
            }else{//right
                st=mid+1;
            }

        }
        return -1;//value does not exist
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14};
        int key=10;
        System.out.println("INDEX FOR GIVEN KEY IS:"+search(number,key));

    }
}
