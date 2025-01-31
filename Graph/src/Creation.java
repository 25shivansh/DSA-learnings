import java.lang.reflect.Array;
import java.util.*;
public class Creation {
    static class Edges{
        int src;
        int dest;
        int wt;
        public Edges(int s,int d, int w ){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<Edges>[]graph=new ArrayList[V];
        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        }
        //0 -vertex
        graph[0].add(new Edges(0,1,5));
        //1 -vertex
        graph[1].add(new Edges(1,0,5));
        graph[1].add(new Edges(1,2,1));
        graph[1].add(new Edges(1,3,3));
        //2 -vertex
        graph[2].add(new Edges(2,1,1));
        graph[2].add(new Edges(2,3,1));
        graph[2].add(new Edges(2,4,4));
        //3 -vertex
        graph[3].add(new Edges(3,1,3));
        graph[3].add(new Edges(3,2,1));
        //4 -vertex
        graph[4].add(new Edges(4,2,2));
        //2's neighbours
        for(int i=0;i<graph[2].size();i++){
            Edges e=graph[2].get(i);//src, dest, wt
            System.out.println(e.dest);
        }




    }
}
