class Solution {
    public String reverseOnlyLetters(String s) {
        int start = 0, end = s.length()-1;
        char arr[] = s.toCharArray();
        while(start < end){
            if(!Character.isLetter(arr[start])) start++;
            else if(!Character.isLetter(arr[end])) end--;
            else{
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start ++;
                end --;
            }
        }
        return new String(arr);
    }
}