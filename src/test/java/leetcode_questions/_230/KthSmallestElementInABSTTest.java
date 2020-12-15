package leetcode_questions._230;

import leetcode_questions.util.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class KthSmallestElementInABSTTest {
    private KthSmallestElementInABST kthSmallestElementInABST;

    @Before
    public void beforeEach() {
        kthSmallestElementInABST = new KthSmallestElementInABST();
    }

    @Test
    public void kthSmallest_1() {
        TreeNode input = createBst();
        int k = 1;
        int actual = kthSmallestElementInABST.kthSmallest(input, k);

        int expected = 1;

        assertThat(actual, is(expected));

    }

    @Test
    public void kthSmallest_2() {
        TreeNode input = createBst();
        int k = 2;
        int actual = kthSmallestElementInABST.kthSmallest(input, k);

        int expected = 2;

        assertThat(actual, is(expected));

    }

    @Test
    public void kthSmallest_3() {
        TreeNode input = createBst();
        int k = 3;
        int actual = kthSmallestElementInABST.kthSmallest(input, k);

        int expected = 3;

        assertThat(actual, is(expected));

    }

    private TreeNode createBst(){
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(4);
        TreeNode leftright = new TreeNode(2);

        root.left = left;
        root.right = right;
        left.right = leftright;
        return root;
    }
}