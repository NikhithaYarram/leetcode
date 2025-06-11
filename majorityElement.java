class Solution {
    public int majorityElement(int[] nums) {
        int candidate=nums[0];
        int count=1;
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]==candidate){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                candidate=nums[i];
                count=1;
            }

        }

     return candidate;
    }
}