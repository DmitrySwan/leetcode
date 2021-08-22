class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> sortedRangeList = new ArrayList<>();

        StringBuilder range = new StringBuilder();

        for(int index = 0; index < nums.length;) {

            range.append(nums[index]);

            int startIndex = ++index;

            while(index < nums.length && nums[index] == nums[index - 1] + 1){
                ++index;
            }

            if(startIndex != index){
                range.append("->").append(nums[index - 1]);
            }

            sortedRangeList.add(range.toString());
            range.setLength(0);
        }

        return sortedRangeList;
    }
}