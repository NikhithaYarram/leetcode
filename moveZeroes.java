class Solution {
    public void moveZeroes(int[] nums) {
        int size=0;
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                nums[size++]=nums[i];
            }
        }
        
        while(size<n){
                nums[size++]=0;
        }
        
    }
}