class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet hs = new HashSet<Number>();
        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        return nums.length != hs.size();
    }
}