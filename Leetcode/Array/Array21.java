/*
3. Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring without duplicate characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Leetcode: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
*/
class Array21 {

    public int lengthOfLongestSubstring(String s) {

        int max = 0;

        for (int left = 0; left < s.length(); left++) {

            String current = "";

            for (int right = left; right < s.length(); right++) {

                char ch = s.charAt(right);

                // duplicate found
                if (current.indexOf(ch) != -1) {
                    break;
                }

                current += ch;

                max = Math.max(max, current.length());
            }
        }

        return max;
    }
}

/*
Another Solution:
import java.util.HashSet;

class Solution {

    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            // duplicate exists
            while (set.contains(s.charAt(right))) {

                set.remove(s.charAt(left));

                left++;
            }

            // add current character
            set.add(s.charAt(right));

            // update maximum length
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
*/
