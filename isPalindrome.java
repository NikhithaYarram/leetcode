class Solution {
    public boolean isPalindrome(int x) {
        int revnum=0;
        int orig=x;
        while(x>0){
            revnum=revnum*10+ x%10;
            x/=10;
        }
        if(orig==revnum){
            return true;
        }
        else{
            return false;
        }
    }
}