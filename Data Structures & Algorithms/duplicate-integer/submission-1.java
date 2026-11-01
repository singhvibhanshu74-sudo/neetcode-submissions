
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i])) {
                flag = true;
                break;
            }
            seen.add(nums[i]);
        }
        return flag;
    }
}