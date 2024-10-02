import javax.swing.tree.TreeNode;

public class BST {

    public static class Node {
        int data;
        Node left, right;

        Node(int ele) {
            data = ele;
            left = null;
            right = null;
        }
    }

    public static Node InsertBST(Node root, int ele) {
        if (root == null) {
            Node newNode = new Node(ele);
            return newNode;
        }
        if (root.data < ele) {
            root.right = InsertBST(root.right, ele);
        } else if (root.data > ele) {
            root.left = InsertBST(root.left, ele);
        }
        return root;
    }

    public static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.println(root.data);
        Inorder(root.right);
    }
    public Node deleteNode(Node root, int key) {
        if(root == null){
            return root;
        }
        if( root.data > key){
            root.left = deleteNode(root.left, key);
        }
        else if(root.data < key){
            root.right = deleteNode(root.right, key);
        }
        else{
            if(root.left == null && root.right == null) return null;
            if(root.left == null && root.right != null) return root.right;
            if(root.left != null && root.right == null) return root.left;
            Node temp = root.right;
            while(temp.left != null){
                temp = temp.left;
            }
            root.right = deleteNode(root.right , temp.val);
            root.data = temp.data;
        }
        return root;
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 7, 1, 2, 8, 3, 5, 10};
        Node root = null;
        for (int i = 0; i < arr.length; ++i) {
            root = InsertBST(root, arr[i]);
        }
        Inorder(root);
    }
}
