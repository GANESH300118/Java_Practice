// inorder(left,root,right)
// preorder(root,left,right)
// postorder(left,rigth,root)
import java.util.*;
class BT{
    Node root = null;
    public class Node{
        int data;
        Node left, right;
        Node(int ele){
            data=ele;
            left=null;
            right=null;
        }
    }
    void inorder (Node root){
        if(root==null){
            return ;
        }
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
    }
    void postorder(Node root){
        if(root == null){
            return;
        }
    }
    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }
        int la=maxDepth(root.left);
        int lb=maxDepth(root.right);
        return Math.max(la,lb)+1;
    }
    int Diameter=0;
    public int fun(Node root){
        if(root == null){
            return 0;
        }
        int la = fun(root.left);
        int lb = fun(root.right);
        if((la + lb + 1) > this.Diameter){
            this.Diameter = la + lb ;
        }
        return Math.max(la, lb) + 1;
    }
    public int diameterOfBinaryTree(Node root) {
        fun(root);
        return this.Diameter;
    }
    // same tree leetcode 100
    public boolean isSameTree(Node p, Node q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.data != q.data){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root!= null){
            q.offer(root);
        }
        while(!q.isEmpty()){
            List<Integer> level =new ArrayList<>();
            int z = q.size();
            for(int i=0;i<z;i++){
                Node x = q.poll();
                if(x.left != null){
                    q.offer(x.left);
                }
                if(x.right != null){
                    q.offer(x.right);
                }
                level.add(x.data);
            }
            ans.add(level);
        }
        return ans;
    }
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> level = new ArrayList<>();
        PathFinder(root,level,ans);
        return ans;
    }
    public static void PathFinder( Node node, ArrayList<Integer> level, ArrayList<ArrayList<Integer>> ans){
        if( node == null){
            return;
        }
        level.add(node.data);
        if( node.left == null && node.right == null){
            ans.add(new ArrayList<Integer>(level));
        }
        else{
            PathFinder(node.left,level, ans);
            PathFinder(node.right,level,ans);
        }
        level.remove(level.size()-1);
    }
}
public class Binary_Tree {
    public static void main(String args[]){

    }
}