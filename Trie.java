import java.util.*;
public class Trie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        while(choice != -11){
            switch (choice) {
                case 1:
                    String str = sc.next();
                    insert(str);
                    break;
                case 2:
                    System.out.println(search(sc.next()));
                    break;
            
                default:
                return;
            }
            choice = sc.nextInt();
        }
    }
    static class Node{
        Node[] children;
        boolean eow;
        Node(){
            children = new Node[26];
            for(int i=0;i<26;i++){
                children[i] = null;
            }
            eow = false;
        }
    }
    public static Node root = new Node();
    public static boolean search(String str){
        Node curr = root;
        for(int i=0;i<str.length();i++){
            int index = str.charAt(i ) - 'a';
            if(curr.children[index] == null){
                return false;
            }
            if(i == str.length()-1 && curr.children[index].eow == false){
                return false;
            }
            curr = curr.children[index];
        }
        return true;
    }
    public static void insert(String str){
        Node curr = root;
        for(int i=0;i<str.length();i++){
            int index = str.charAt(i) - 'a';
            if(curr.children[index] == null){
                curr.children[index] = new Node();
            }
            if(i == str.length()-1){
                curr.children[index].eow = true;
                curr = curr.children[index];
            }
        }
    }
}