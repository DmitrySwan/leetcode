class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> solution = new LinkedList<>();
        if(nums.length==0) return solution;

        StringBuilder buffer = new StringBuilder(String.valueOf(nums[0]));
        if(nums.length==1) {
            solution.add(buffer.toString());
            return solution;
        }
        int count=0;
        for (int i=1; i<nums.length ; i++) {
            if (nums[i] == nums[i-1] + 1) {
                count ++;
                if (nums.length!=i+1) {
                    continue;
                }
            }
            else if(count > 0){
                buffer.append("->").append(nums[i - 1]);
                solution.add(buffer.toString());
                count = 0;
                buffer = new StringBuilder(String.valueOf(nums[i]));

            }
            else {
                solution.add(buffer.toString());
                buffer = new StringBuilder(String.valueOf(nums[i]));

            }
            if(nums.length == i+1) {
                if (count>0){
                    buffer.append("->").append(nums[i]);
                }
                solution.add(buffer.toString());
            }
        }
        System.out.println("test string for github");
        return solution;
    }
}