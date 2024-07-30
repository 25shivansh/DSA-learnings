package ARRAYLIST;

import java.util.ArrayList;
//FIND IF ANY PAIR IN A SORTED & ROTATED ARRAYLIST HAS A TARGET SUM

public class pairsum2 {
    static boolean rotatedtarget(ArrayList<Integer>list,int target){
        //bp-->breaking point
        int bp=-1;
        int n= list.size();
        for(int i=0;i<list.size();i++){//breaking point
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        /*
        lp=left pointer
        rp=right pointer
         */
        int lp=bp+1;//SMALLEST
        int rp=bp;//LARGEST
        while(lp!=rp){
            //CASE-1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }else{
                //CASE-3
                rp=(n+rp-1)%n;
            }
        }
        return false;


    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;
        System.out.println(rotatedtarget(list,target));
    }
}
