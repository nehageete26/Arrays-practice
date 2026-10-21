class Solution {
    public int minOperations(String s) {
        int n = s.length();
        char max = 'a',  min = 'z';
        boolean is_sorted = true;
        for (int i = 0; i < n; i++) {
            max = (char) Math.max(max, s.charAt(i));
            min = (char) Math.min(min, s.charAt(i));
            if (i > 0 && s.charAt(i - 1) > s.charAt(i)) is_sorted = false;
        }
        if (is_sorted) return 0;
        if (n == 2) return -1;
        if (s.charAt(0) == min || s.charAt(n - 1) == max)  return 1;
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == min || s.charAt(i) == max)  return 2;
        }
        return 3;
    }
}