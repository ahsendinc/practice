public class Solution {
    public int[] twoSum(int[] nums, int target) {
        //int last = nums[0];
        int[] myarr = new int[2];
        int i,j;
        for(i=0; i<nums.length; i++){
            for(j=i+1; j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    myarr[0]=i;
                    myarr[1]=j;
                    break;
                }
            }
            if (j<nums.length)
            break;
        }
        return myarr;
    }
}