class Solution {
    public int maxProduct(int n) {
        int first = 0 , second = 0;
        while(n!=0){
            int lastdigit = n%10;
            if(lastdigit > first){
            second = first;
            first = lastdigit;
            }
            else if(lastdigit > second){
                second = lastdigit;
            }
            n/=10;
        }
        return first * second;
    }
}