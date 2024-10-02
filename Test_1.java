import java.util.*;

class Tree {
    int val;
    Tree left;
    Tree right;

    Tree(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    Tree root;
    public void buildTree(String[] levelOrder) {
        if (levelOrder == null || levelOrder.length == 0) {
            root = null;
            return;
        }
        Queue<Tree> queue = new LinkedList<>();
        root = new Tree(Integer.parseInt(levelOrder[0]));
        queue.offer(root);
        int index = 1;

        while (!queue.isEmpty() && index < levelOrder.length) {
            Tree current = queue.poll();

            if (index < levelOrder.length && !levelOrder[index].equals("N")) {
                current.right = new Tree(Integer.parseInt(levelOrder[index]));
                queue.offer(current.right);
            }
            index++;

            if (index < levelOrder.length && !levelOrder[index].equals("N")) {
                current.left = new Tree(Integer.parseInt(levelOrder[index]));
                queue.offer(current.left);
            }
            index++;
        }
    }

    public void Inorder(Tree root) {
        if (root == null) {
            return;
        }

        Inorder(root.left);
        System.out.print(root.val + " ");
        Inorder(root.right);
    }
}

class Test_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().trim().split(" ");
        BinaryTree s = new BinaryTree();
        s.buildTree(a);
        s.Inorder(s.root);
    }
}