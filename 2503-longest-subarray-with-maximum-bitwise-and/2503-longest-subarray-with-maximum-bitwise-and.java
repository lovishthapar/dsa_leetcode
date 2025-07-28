class Solution {
    public int longestSubarray(int[] nums) {
        int maxVal = nums[0];
        int maxLen = 1, currLen = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxVal) {
                maxVal = nums[i];
                currLen = 1;
                maxLen = 1;
            } else if (nums[i] == maxVal) {
                currLen++;
                if (currLen > maxLen) {
                    maxLen = currLen;
                }
            } else {
                currLen = 0;
            }
        }

        return maxLen;
    }
}
