
import java.util.ArrayList;
import java.util.List;

class Solution {
    public void helper(int pos, int n, int[] nums, List<List<Integer>> ans) {
        // If we have reached the end of nums, we have found a Valid Permutations of nums

        if (pos >= n) {
            List<Integer> permutation = ConverttoArray(nums);
            ans.add(new ArrayList(permutation));
            return;
        }

        // Otherwise we iterate over all the other elements and try to generate Permutations by swapping element at pos with element at i

        for (int i = pos; i < n; i++) {
            // We create one Unique Permutation by swapping

            swap(pos, i, nums);

            // And we ask Recursion to handle rest of the task

            helper(pos + 1, n, nums, ans);

            // But after we come back, we must backtrack and undo the changes we have done

            swap(pos, i, nums);
        }

        return;
    }

    public void swap(int i, int j, int[] nums) {
        // Swaping the elements

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public List<Integer> ConverttoArray(int[] nums) {
        // Converting the array into List

        List<Integer> ans = new ArrayList<>();
        for (int ele : nums)
            ans.add(ele);
        return ans;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        helper(0, nums.length, nums, ans);

        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.permute(new int[]{1, 2, 3}));
    }
}

