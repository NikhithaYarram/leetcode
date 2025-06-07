class Solution {
    public int removeDuplicates(int[] nums) {
        int size=1;
        int n=nums.length-1;
        for(int i=0; i<n; i++){
             if(nums[i]!=nums[i+1]){
                nums[size++]=nums[i+1];
             }
        }
        return size;
    }
}
