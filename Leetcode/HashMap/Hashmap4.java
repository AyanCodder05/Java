/*
383. Ransom Note

Given two strings ransomNote and magazine, return true if ransomNote can be 
constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true

Leetcode: https://leetcode.com/problems/ransom-note/description/
*/
import java.util.HashMap;

class Hashmap4 {

    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();

        // STEP 1: build frequency map from magazine
        for (int i = 0; i < magazine.length(); i++) {

            char ch = magazine.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // STEP 2: check ransomNote characters
        for (int i = 0; i < ransomNote.length(); i++) {

            char ch = ransomNote.charAt(i);

            // character not available
            if (!map.containsKey(ch)) {
                return false;
            }

            // decrease frequency
            map.put(ch, map.get(ch) - 1);

            // frequency finished
            if (map.get(ch) < 0) {
                return false;
            }
        }

        return true;
    }
}
 