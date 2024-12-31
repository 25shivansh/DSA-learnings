


public class Search {
    static class Node{
        Node children[]=new Node [26];
        boolean eow;
        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
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
    public static void main(String[] args) {
        String Words[]={"the","a","there","their","any","thee"};
        for(int i=0;i<Words.length;i++){
            insert(Words[i]);
        }
        System.out.println(search("any"));
        System.out.println(search("an"));
    }

}
