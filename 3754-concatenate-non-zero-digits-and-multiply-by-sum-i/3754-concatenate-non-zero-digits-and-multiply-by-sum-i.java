class Solution {
    public long sumAndMultiply(int n) {
        int dup = n;
        int ans = 0;
        int place = 1;
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0) {
                ans = digit * place + ans;
                place *= 10;
            }
            n /= 10;
        }
        int sum = 0;
        while(dup > 0){
            int last_digit = dup%10;
            sum += last_digit;
            dup /= 10;
        }
        return (long) sum * ans;
    }
}