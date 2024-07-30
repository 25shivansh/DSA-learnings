import java.util.Scanner;

public class spiralmatrix {
    static void spiralmatrix(int arr[][],int r,int c){
        int startrow=0,endingrow=r-1,startcol=0,endcol=c-1;
        while(startrow<=endingrow && startcol<=endcol){
            //TOP
            for(int j=startcol;j<=endcol;j++){
                System.out.print(arr[startrow][j]+" ");
            }
            //RIGHT
            for(int i=startrow+1;i<=endingrow;i++){
                System.out.print(arr[i][endcol]+" ");
            }
            //BOTTOM
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endingrow){
                    break;
                }
                System.out.print(arr[endingrow][j]+" ");
            }
            //LEFT
            for(int i=endingrow-1;i>=startrow+1;i--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(arr[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endcol--;
            endingrow--;
        }
        System.out.println();

    }
    static void printmatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS:" );
        int r=sc.nextInt();
        System.out.println("ENTER NUMBER OF COLUMNS:");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("ENTER "+(i+1)+(j+1)+" ELEMENT:");
                arr[i][j]=sc.nextInt();
            }
        }
        spiralmatrix(arr,r,c);
        //printmatrix(arr);
    }
}
