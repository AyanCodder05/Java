/*
242. Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false

Leetcode: https://leetcode.com/problems/valid-anagram/description/
*/
import java.util.HashMap;
class Hashamp{

    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> map= new HashMap<>();
        // count frequency from first string
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // reduce frequency using second string
        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);

            // character not present
            if (!map.containsKey(ch)) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);

            // remove if frequency becomes 0
            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        return map.isEmpty();
    }

}