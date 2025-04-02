class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length]; // Create a new array to store the running sum
        result[0] = nums[0]; // Initialize the first element
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i]; // Calculate the running sum
        }
        return result; // Return the new array
    }
}