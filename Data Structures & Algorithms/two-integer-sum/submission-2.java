class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int a_IndexOfAddend = 0; a_IndexOfAddend < nums.length; a_IndexOfAddend++) {
            int b_addend = target - nums[a_IndexOfAddend];
            for (int indexOfSearch = 0; indexOfSearch < nums.length; indexOfSearch++){
                if (indexOfSearch != a_IndexOfAddend) {
                    if(b_addend == nums[indexOfSearch]){
                        int[] result = {a_IndexOfAddend, indexOfSearch};
                        return result;
                    }
                }
            }
        }
        return null;
    }
}