class Solution {
    public boolean checkString(String s) {
        // for (int i = 0; i < s.length(); i++) {
        //     if (s.charAt(i) != 'b') continue;
        //     for (int j = i + 1; j < s.length(); j++) {
        //         if (s.charAt(j) == 'a') return false;
        //     }
        // }
        // return true;
        int a=s.indexOf("b");
        if(a==-1) return true;
        for(int i=a+1;i<s.length();i++){
            if(s.charAt(i)=='a'){
                return false;
            }
        }
        return true;
    }
}