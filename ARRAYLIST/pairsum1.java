package ARRAYLIST;

import java.util.ArrayList;
//FIND IF ANY PAIR IN A SORTED ARRAYLIST HAS A TARGET SUM

public class pairsum1 {
    //TIME COMPLEXITY=O(n^2)
    static int targetsum(ArrayList<Integer>list,int target){//BRUTE FORCE APPROACH
        int pairsum=0;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    pairsum++;
                }
            }
        }
        return pairsum;
    }
    //TWO POINTER APPROACH
    static boolean targetsum1(ArrayList<Integer>list,int target){
        /*
        lp-->LEFT POINTER
        rp-->RIGHT POINTER
         */
        int lp=0;
        int rp=list.size()-1;
        while(lp!=rp){
            //CASE-1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            //CASE-2
            else if(list.get(lp)+list.get(rp)<target){
               lp++;
            }else{
                //CASE-3
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=50;
        //System.out.println("NUMBER OF PAIRS WHOSE SUM IS EQUAL TO TARGET ARE:"+targetsum(list,target));
        System.out.println(targetsum1(list,target));
    }
}
