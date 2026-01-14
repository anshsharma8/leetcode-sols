class Solution {
    public int findDuplicate(int[] nums) {
  
  int x=0;
    for(int i=0;i<nums.length;i++)
    {

        if(nums[Math.abs(nums[i])-1]<0)
        {
            x= Math.abs(nums[i]);
            
        }
        nums[Math.abs(nums[i])-1]=-nums[Math.abs(nums[i])-1];
        
    }
    return x;    
    }
}
