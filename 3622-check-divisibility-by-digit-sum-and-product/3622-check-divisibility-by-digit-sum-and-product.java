class Solution {
    public boolean checkDivisibility(int n) {
        int total = 0, sum = 0, product = 1, dup = n;
        while(n != 0){
            int last = n%10;
            sum += last;
            product *= last;
            n /= 10;
        }
        total += sum + product;
        if(dup%total == 0) return true;
        else return false;
    }
}