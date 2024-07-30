import java.util.Arrays;
import java.util.Collections;
public class inbuiltsort {
    static void ascendingsorting(int num[]){//ASCENDING ORDER
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    static void descendingsorting(Integer arr[]){//DESCENDING ORDER
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[]={1,2,3,4,5,6};
        Arrays.sort(arr,Collections.reverseOrder());//DESCENDING ORDER
        System.out.print("DESCENDING ORDER:");
        descendingsorting(arr);
        int num[]={6,5,4,3,2,1};
        Arrays.sort(num);//ASCENDING ORDER
        System.out.print("ASCENDING ORDER:");
        ascendingsorting(num);
    }
}
