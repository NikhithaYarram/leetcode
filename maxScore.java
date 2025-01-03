class Solution {
    public int maxScore(String s) {

        int n=s.length();
        int ones=0;

       for(int i=0;i<n;i++){
        if(s.charAt(i)=='1'){
            ones++;
        }
       }
       int zeros=0;
       int maxCount=0;
       for(int i=0;i<n-1;i++){
        if(s.charAt(i)=='0'){
            zeros++;
        }
        else{
            ones--;
        }

        maxCount=Math.max(maxCount, zeros+ones);
       }
       return maxCount;
    }
}