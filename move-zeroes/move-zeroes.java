class Solution {
    public void moveZeroes(int[] nums) {
        int countZeros = 0;      
        int notZeroValueIndex = 0;
        int i = 0;
        while(i<nums.length) {
            if(nums[i] == 0) {
                countZeros++;
            }
            else {
                nums[notZeroValueIndex] = nums[i];
                notZeroValueIndex++;
            }
            if(notZeroValueIndex + countZeros == nums.length) {
                break;
            }
            i++;
        }
        while(countZeros != 0) {
            nums[nums.length - countZeros] = 0;
            countZeros--;
        }
    }
}