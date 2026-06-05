
import java.util.HashMap;

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
class String6{
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        HashMap<Character, Integer>map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            

            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }
            else{
                map.put(ch, 1);
            }

        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if(!map.containsKey(ch)){
                return;
            }

            map.put(ch, map.get(ch) - 1);
            if(map.get(ch)<0){
                return;
            }
        }

        
    }
}



/*
Another Solution:
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for (int check : arr) {
            if (check != 0)
                return false;
        }

        return true;
    }
}
*/
