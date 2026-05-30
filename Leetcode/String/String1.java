/*
344. Reverse String
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

Leetcode: https://leetcode.com/problems/reverse-string/description/

Answer only:

1. If the first character goes to the last position, where should the last character go?
2. Which technique does that suggest?

Options:

* One pointer
* Two pointers
* Sliding window
* HashMap
3. If you use two pointers, where should they start?

*/
class String1{

public void reverseString(char[] s){
    int left=0;
    int right=s.length-1;

    while(left<right){
        char temp=s[left];
        s[left]=s[right];
        s[right]=temp;

        left++;
        right--;
    }
}


}

/*
2. Which technique does that suggest?
You answered: HashMap
Wrong.

Ask yourself:

Do I need to store information?
Do I need key → value mapping?

No.

We only need to:  swap characters

So the technique is: Two Pointers
*/