class Solution {
    public int countElements(int[] nums) {
        int i,count=0;
        int max=nums[0];
        int min=nums[0];
        for(i=1; i<nums.length; i++) {
            if(nums[i]>max ) {
                max=nums[i];
              
            } else if(nums[i]< min) {
                  min=nums[i];
            }
        }
        for(int num:nums) {
            if(num<max && num>min) {
                count++;
            }
        }
      return count;
    }
}