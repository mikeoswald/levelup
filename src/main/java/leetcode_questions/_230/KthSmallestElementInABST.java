package leetcode_questions._230;

import leetcode_questions.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementInABST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(4);
        TreeNode leftright = new TreeNode(2);

        root.left = left;
        root.right = right;
        left.right = leftright;

        System.out.println(new KthSmallestElementInABST().kthSmallest(root, 1));
        System.out.println(new KthSmallestElementInABST().kthSmallest(root, 3));
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> res = new ArrayList<>();
        helper(root,  res, k);
        return res.get(k - 1);
    }

    private void helper(TreeNode root, List<Integer> list, int k) {
        if(root != null && k > list.size()) {
            helper(root.left, list, k);
            list.add(root.val);
            helper(root.right, list, k);
        }
    }
}
