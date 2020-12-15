package leetcode_questions._226;

import leetcode_questions.util.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class InvertBinaryTreeTest {

    private InvertBinaryTree invertBinaryTree;

    @Before
    public void beforeEach() {
        invertBinaryTree = new InvertBinaryTree();
    }

    @Test
    public void invertTree() {
        TreeNode input = input();

        TreeNode actual = invertBinaryTree.invertTree(input);

        TreeNode expected = expected();

        assertThat(actual, is(expected));
    }

    private TreeNode expected(){
        TreeNode root = new TreeNode(4);
        TreeNode left = new TreeNode(7);
        TreeNode right = new TreeNode(2);
        TreeNode leftleft = new TreeNode(9);
        TreeNode leftright = new TreeNode(6);
        TreeNode rightleft = new TreeNode(3);
        TreeNode rightright = new TreeNode(1);

        root.left = left;
        root.right = right;
        left.left = leftleft;
        left.right = leftright;
        right.right = rightright;
        right.left = rightleft;

        return root;
    }

    private TreeNode input() {
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

        return root;
    }
}