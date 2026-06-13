
import java.util.HashSet;

/*
202. Happy Number
Write an algorithm to determine if a number n is happy.
A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

Example 1:
Input: n = 19
Output: true
Explanation:
1**2 + 9**2 = 82
8**2 + 2**2 = 68
6**2 + 8**2 = 100
1**2 + 0**2 + 0**2 = 1

Example 2:
Input: n = 2
Output: false

Leetcode: https://leetcode.com/problems/happy-number/description/

*/
class Day1_202{
    public boolean isHappy(int n) {
        HashSet <Integer> set=new HashSet<>();
        while(n!=1 && !set.contains(n)){
        set.add(n);
        int sum=0;

        // calculate sum of squares of digits
        while(n>0){
            int digits=n %10;
            sum+=digits*digits;
            n/=10;
        }        
        n=sum;
        }
        return n==1;
    }
    public static void main(String[] args) {
        Day1_202 ss=new Day1_202();
        System.out.println(ss.isHappy(2));
    }
}