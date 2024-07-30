package ARRAYLIST;
import java.util.ArrayList;

public class intro {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();//CREATING A ARRAYLIST
        ArrayList<String>list2=new ArrayList<>();
        ArrayList<Boolean>list3=new ArrayList<>();
        //OPERATIONS ON ARRAYLIST
        //1--> ADD OPERATION
        list.add(1);
        list.add(2);
        list.add(3);//T(c)=O(1)
        list.add(4);
        list.add(5);
        System.out.println(list);
        //2-->GET OPERATION
        int element=list.get(4);//T(c)=O(1)
        System.out.println(element);
        //3-->REMOVE ELEMENT OR DELETE
        list.remove(2);//T(c)=O(n)
        System.out.println(list);
        //4-->SET ELEMENT AT INDEX
        list.set(2,10);//T(c)=O(n)
        System.out.println(list);

        //CONTAINS T(c)=O(n)
        System.out.println(list.contains(1));//true
        System.out.println(list.contains(11));//false

        //ADD ELEMENT AT A PARTICULAR INDEX USING ADD ELEMENT
        list.add(1,9);//T(c)=O(n)
        System.out.println(list);
        //SIZE OF ARRAYLIST
        System.out.println(list.size());
        //PRINT THE ARRAY LIST
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
