package recursion_practice;

public class ReverseArray {
    public int [] reverseArrayIterative(int [] nums) {
        if (nums == null) {
            return nums;
        }
        int j = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if(i > j) break;
            //swap
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j--;
        }
        return nums;
    }
    public int [] reverseArrayRecursive(int [] nums) {
        if(nums == null) return null;

        reverseArrayRecursive(nums, 0, nums.length - 1);
        return nums;
    }

    public void reverseArrayRecursive(int [] nums, int i, int j) {
        if (i > j) return;

        //swap
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

        reverseArrayRecursive(nums, i + 1, j - 1);

    }
}
