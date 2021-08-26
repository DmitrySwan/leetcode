class Solution {
    public void moveZeroes(int[] nums) {
        
        int insertionPos = 0;
        for(int num: nums) {
            if(num != 0)  {
                nums[insertionPos++] = num;
            }
        } 
        while(insertionPos < nums.length) {
            nums[insertionPos++] = 0;
        }
    }
}