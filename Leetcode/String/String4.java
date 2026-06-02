
import java.util.HashMap;

/*
387. First Unique Character in a String
Given a string s, find the first non-repeating character in it and return its index. 
If it does not exist, return -1.

 

Example 1:
Input: s = "leetcode"
Output: 0
Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:
Input: s = "loveleetcode"
Output: 2
Example 3:
Input: s = "aabb"
Output: -1

Leetcode: https://leetcode.com/problems/first-unique-character-in-a-string/description/
*/
class String4{
    public static void main(String[] args) {
        HashMap <Character, Integer> map =new HashMap<>();
        String s="loveleetcode";

        char [] charArray=s.toCharArray();

        for(char c:charArray){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }

        }

        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1) {
                System.out.println(i);
                break;
            }
        }
    }
}


/*
Another Solution:
class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;        
    }
}
*/