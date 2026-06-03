
import java.util.HashMap;

/*
205. Isomorphic Strings
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"

Output: true

Explanation:

The strings s and t can be made identical by:

Mapping 'e' to 'a'.
Mapping 'g' to 'd'.
Example 2:

Input: s = "f11", t = "b23"

Output: false

Explanation:

The strings s and t can not be made identical as '1' needs to be mapped to both '2' and '3'.

Example 3:

Input: s = "paper", t = "title"

Output: true

Leetcode: https://leetcode.com/problems/isomorphic-strings/description/

*/



class String5{

    public static void main(String[] args) {
        String s = "egg", t = "add";
        HashMap <Character, Character>map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1=s.charAt(i);
            char c2=t.charAt(i);

            if(map.containsKey(c1)){
                //Check consistency
                if(map.get(c1)!=c2) return;
            }

            //Create Mapping
            else{
                if(map.containsValue(c2)) return;
                map.put(c1,c2);
            }

        }
    }

}


/*
Another Solution:
class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Create arrays to store the index of characters in both strings
        int[] indexS = new int[200]; // Stores index of characters in string s
        int[] indexT = new int[200]; // Stores index of characters in string t
        
        // Get the length of both strings
        int len = s.length();
        
        // If the lengths of the two strings are different, they can't be isomorphic
        if(len != t.length()) {
            return false;
        }
        
        // Iterate through each character of the strings
        for(int i = 0; i < len; i++) {
            // Check if the index of the current character in string s
            // is different from the index of the corresponding character in string t
            if(indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
                return false; // If different, strings are not isomorphic
            }
            
            // Update the indices of characters in both strings
            indexS[s.charAt(i)] = i + 1; // updating index of current character
            indexT[t.charAt(i)] = i + 1; // updating index of current character
        }
        
        // If the loop completes without returning false, strings are isomorphic
        return true;
    }
}
*/