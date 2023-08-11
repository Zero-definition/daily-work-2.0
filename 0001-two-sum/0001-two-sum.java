class Solution {
    public int[] twoSum(int[] nums, int target) {
         int[] a=new int[2];
         a[0]=0;
         a[1]=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                   
                    a[1]=i;
                    a[0]= j;
                }
            }
        }
        return a;
    }
}