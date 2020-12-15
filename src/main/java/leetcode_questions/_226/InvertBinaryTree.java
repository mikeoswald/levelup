package leetcode_questions._226;

import leetcode_questions.util.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(7);
        TreeNode leftleft = new TreeNode(1);
        TreeNode leftright = new TreeNode(3);
        TreeNode rightleft = new TreeNode(6);
        TreeNode rightright = new TreeNode(9);

        root.left = left;
        root.right = right;
        left.left = leftleft;
        left.right = leftright;
        right.right = rightright;
        right.left = rightleft;

        System.out.println(new InvertBinaryTree().invertTree(root));
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        Deque<TreeNode> q = new ArrayDeque<>();
        //poll, offer

        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            TreeNode temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;

            if(curr.left != null) q.offer(curr.left);
            if(curr.right != null) q.offer(curr.right);
        }
        return root;
    }
}
