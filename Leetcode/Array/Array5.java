/*
344. Reverse String

Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Leetcode: https://leetcode.com/problems/reverse-string/description/
*/
class Array5{
    public void reverseString(char[] s) {
        int n=s.length;
        int left =0;
        int right=n-1;

        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;

            left++;
            right --;
        }
        
    }
    
}