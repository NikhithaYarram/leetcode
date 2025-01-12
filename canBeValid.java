class Solution {
    public boolean canBeValid(String s, String locked) {
        if (s.length() % 2 != 0) 
            return false;

        int balanceCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (locked.charAt(i) == '0' || s.charAt(i) == '(') 
                balanceCount++;
            else 
                balanceCount--;
            if (balanceCount < 0) 
                return false;
        }

        balanceCount = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (locked.charAt(i) == '0' || s.charAt(i) == ')') 
                balanceCount++;
            else 
                balanceCount--;
            if (balanceCount < 0) 
                return false;
        }

        return true;
    }
}