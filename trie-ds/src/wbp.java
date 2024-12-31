//Word break problem
public class wbp {
    static class Node {
        Node children[] = new Node[26];
        boolean eow;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }

    }
    public static Node root=new Node();
    public static void insert(String Words){
        Node curr=root;
        for(int level=0;level<Words.length();level++){
            int idx=Words.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;

    }
    public static boolean search(String key){
        Node curr=root;
        for(int level=0;level<key.length();level++){
            int idx=key.charAt(level)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.eow;

    }
    public static boolean wordBreak(String key){//O(n)
        if(key.length()==0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
            //substring(beg idx,last idx)
            if(search(key.substring(0,i))&& wordBreak(key.substring(i))){
                return true;
            }


        }
        return false;
    }

    public static void main(String[] args) {
        String arr[]={"i","like","sam","samsung","mobile","ice"};
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
        String key="ilikesamsung";
        System.out.println(wordBreak(key));
    }
}
