class Solution {
    public int punishmentNumber(int n) {
        int rs = 0;
        for (int i = 1; i <= n; ++i){
            if (isValid(i)){
                rs = rs + i*i;
            }
        }
        return rs;
    }
    public boolean isValid(int sum){
        int [] arr = new int[count(sum*sum)];
        int n = arr.length, val = sum*sum;
        for (int i = n - 1; i >= 0; --i){
            arr[i] = val%10;
            val = val/10;
        }
        return rec(arr, sum, 0);
    }
    public boolean rec(int [] arr, int sum, int curr){
        if (curr == arr.length){
            if (sum == 0){
                return true;
            }
            return false;
        }
        int val = 0;
        for (int i = curr; i < arr.length; ++i){
            val = 10*val + arr[i];
            if (sum >= val){
                if (rec(arr, sum - val, i + 1)){
                    return true;
                }
            }
        }
        return false;
    }
    public int count(int n){
        int count = 0;
        while (n > 0){
            count++;
            n = n/10;
        }
        return count;
    }
}
