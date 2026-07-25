// class Solution {
//     public int buyChoco(int[] prices, int money) {
//         Arrays.sort(prices);
//         int remain = 0;
//             if(prices[0]+prices[1] == money) remain = 0;
//             else if (prices[0]+prices[1] < money) remain = money - (prices[0]+prices[1]);
//             else remain =  money;
//         return remain;
//     }
// }

class Solution{
    public int buyChoco(int[] prices, int money) {
        int smallest = Integer.MAX_VALUE;
        int ssmallest = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i] < smallest){
                ssmallest = smallest;
                smallest = prices[i];
            }
            else if(prices[i] < ssmallest) ssmallest = prices[i];
        }
        if(smallest + ssmallest <= money) 
        return money - (smallest + ssmallest);
        else return money;
    }
}