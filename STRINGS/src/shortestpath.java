public class shortestpath {
    static float getpath(String str){//T(c)=O(n)-----LINEAR TIME COMPLEXITY
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            char dir=str.charAt(i);
            //SOUTH
            if(dir=='S'){
                y--;
            }
            //NORTH
            else if (dir=='N') {
                y++;
            }
            //WEST
            else if (dir=='W') {
                x--;
            }
            //EAST
            else{
                x++;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);

    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        System.out.println(getpath(str));

    }
}
