# Maximum product of two digits

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We given a no. we have to return its maximum product.
This can be done by extraction of digits. 

# Approach
<!-- Describe your approach to solving the problem. -->
1. We will assign our first and second as 0
2. While our n!= 0 we extract last digit and check if its greater than the frist digit, if yes then put the first digit in second and put lastdigit into first. 
3. If the lastdigit is greater than second digit then put lastdigit in second. 
4. At the end n/=10 and return first*second.


# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(N)

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
O(1)

# Code
```java []
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
```