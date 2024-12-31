public class startsWith {
    static class Node {
        Node children[]=new Node[26];
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
    public static boolean startsWith(String prefix){
        Node curr=root;
        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String words[]={"apple","app","mango","man","woman"};
        String prefix1="app";//true
        String prefix2="moon";//false
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(startsWith(prefix1));
        System.out.println(startsWith(prefix2));
    }
}
