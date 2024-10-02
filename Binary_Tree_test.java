import java.util.*;
import java.util.TreeMap;
import java.util.Vector;
import java.util.Map.Entry;

class Binary_Tree_test {
    static class Node {
        int data;
        Node left, right;
      
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
  
    public static Node root;
    static Node build(String s[]) {
        if(s[0].equals("N") || s.length == 0) return null;
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        int i = 1;
        while(!q.isEmpty() && i < s.length) {
            Node curr = q.poll();
            String cval = s[i];
            if(!cval.equals("N")) {
                int h = Integer.parseInt(cval);
                curr.left = new Node(h);
                q.add(curr.left);
            }
            i++;
            if(i >= s.length)
                break;
            cval = s[i];
            if(!cval.equals("N")) {
                int h = Integer.parseInt(cval);
                curr.right = new Node(h);
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }
     
    void inorder(Node root) {
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    
    static class Values {
        int max, min;
    }
    
    Values val = new Values();
  
    // Helper method to get the vertical order
    void getVerticalOrder(Node root, int hd, TreeMap<Integer, ArrayList<Integer>> m) {
        if (root == null)
            return;
        
        ArrayList<Integer> get = m.get(hd);
        
        if (get == null) {
            get = new ArrayList<>();
            get.add(root.data);
        }
        else
            get.add(root.data);
        
        m.put(hd, get);
        
        getVerticalOrder(root.left, hd - 1, m);
        getVerticalOrder(root.right, hd + 1, m);
    }
    
    // The main function that prints a given binary tree in vertical order
    void verticalOrder(Node root) {
        if (root == null)
            return;
        
        TreeMap<Integer, ArrayList<Integer>> m = new TreeMap<>();
        int hd = 0;
        getVerticalOrder(root, hd, m);
        
        for (Map.Entry<Integer, ArrayList<Integer>> entry : m.entrySet()) {
            ArrayList<Integer> al = entry.getValue();
            for (Integer i : al)
                System.out.print(i + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Binary_Tree_test ob = new Binary_Tree_test();
        
        String s[] = sc.nextLine().split(" ");
        root = build(s);
        
        ob.verticalOrder(root);
    }
}
