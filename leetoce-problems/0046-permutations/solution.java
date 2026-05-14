class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        permutation(nums, ans, list, freq);
        return ans;
    }

    public static void permutation(int[] arr, List<List<Integer>> ans, List<Integer> list, boolean[] freq) {
        if (arr.length == list.size()) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                list.add(arr[i]);
                permutation(arr, ans, list, freq);
                list.remove(list.size() - 1);
                freq[i] = false;
            }
        }
    }
}
