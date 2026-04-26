/*Concatenation of Array:
Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]

Leetcode: https://leetcode.com/problems/concatenation-of-array/description/
*/
class Array2{
    public static void main(String[] args) {
        
    }
    public int[] getConcatenation(int[] nums) {
        int n= nums.length;
        int [] ans= new int[2*n];
        for (int i =0; i<2*n; i++) {
            ans[i]=nums[i % n];
        }
        return ans;
        
    }

    /*
    import java.util.Arrays;

public int[] getConcatenation(int[] nums) {
    int n = nums.length;
    int[] ans = new int[2 * n];

    System.arraycopy(nums, 0, ans, 0, n);
    System.arraycopy(nums, 0, ans, n, n);

    return ans;
}*/

}

/*
Good—now let’s turn this into **interview-ready notes + deeper concepts** (not just surface-level understanding).

---

# 📌 Concatenation of Array — Interview Notes

---

## 🧠 Problem Summary

* Given array `nums` of size **n**
* Create new array `ans` of size **2n**
* Fill:

  ```
  ans[i] = nums[i]
  ans[i + n] = nums[i]
  ```

👉 Simply: **duplicate the array**

---

# ✅ Approach 1: Loop (Core Understanding)

## 🔑 Idea

Use index mapping with modulo:

```
ans[i] = nums[i % n]
```

## 🧠 Why this works

* For `i < n` → normal access
* For `i ≥ n` → wraps back

---

## 📊 Example

Input:

```
nums = [1,2,1]
```

Execution:

| i | i % n | ans[i] |
| - | ----- | ------ |
| 0 | 0     | 1      |
| 1 | 1     | 2      |
| 2 | 2     | 1      |
| 3 | 0     | 1      |
| 4 | 1     | 2      |
| 5 | 2     | 1      |

Output:

```
[1,2,1,1,2,1]
```

---

## ⏱ Complexity

* Time: **O(n)**
* Space: **O(n)**

---

## ⚠️ When to Use

* When logic is involved (mapping, transformation)
* When interviewer wants **clarity**

---

# ✅ Approach 2: `System.arraycopy` (Optimized)

## 🔑 Idea

Copy entire array twice

---

## 📊 Execution

Step 1:

```
[1,2,1,0,0,0]
```

Step 2:

```
[1,2,1,1,2,1]
```

---

## ⏱ Complexity

* Time: **O(n)** (but faster in practice)
* Space: **O(n)**

---

## ⚠️ When to Use

* Clean code required
* Performance-sensitive scenarios

---

# ⚔️ Key Differences (Interview Table)

| Aspect      | Loop   | arraycopy |
| ----------- | ------ | --------- |
| Control     | Full   | Limited   |
| Speed       | Normal | Faster    |
| Flexibility | High   | Low       |
| Readability | Medium | High      |

---

# 🚨 Interview Strategy (IMPORTANT)

When asked:

### Step 1 → Say brute logic:

> “We create a new array of size 2n and map each index using modulo.”

### Step 2 → Write loop solution

### Step 3 → Optimize:

> “We can use System.arraycopy for faster memory-level copying.”

👉 This shows:

* Understanding
* Optimization thinking

---

# 🔥 NEXT LEVEL (What Interviewers Actually Like)

---

## 🚀 1. In-Place Trick (No Extra Array — Advanced)

👉 Idea:
Store **two values in one index temporarily**

### Concept:

```
nums[i] = original + new_value * n
```

Then extract:

```
nums[i] = nums[i] / n
```

---

## 🧠 Why it works

* Uses **math encoding**
* Stores both:

  * old value
  * new value

---

## ⚠️ When Used

* Space optimization problems
* Competitive programming
* Top company interviews

---

## 🚨 Reality Check

This is **not beginner-level**
If your basics are weak → this will confuse you badly

---

# 🚀 2. Bit Manipulation Trick (Advanced)

👉 Same idea, but using bits instead of multiplication

Used when:

* Value range is limited
* Need faster operations

---

# 🎯 Final Interview One-Liners

* **Basic:**
  “This is a simple array duplication using index mapping.”

* **Better:**
  “We use modulo to map indices and avoid conditional logic.”

* **Best:**
  “We can optimize using System.arraycopy for faster memory operations or use in-place encoding to reduce space complexity.”

---

# 🚨 Brutal Truth

Right now:

* You’re improving ✔
* But still thinking **line-by-line**, not **concept-first**

👉 Interviewers don’t care about code
👉 They care about:

* clarity
* reasoning
* edge cases


*/