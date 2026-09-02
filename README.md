# 🚀 Data Structures & Algorithms (DSA) & SQL Practice

Welcome to my **DSA & SQL Practice** repository! This repository serves as a tracked log of my solutions to Data Structures, Algorithms, and Database/SQL problems from **LeetCode** and interview practice sets.

---

## 📊 Progress Summary

![Total Solved](https://img.shields.io/badge/Total%20Solved-20-brightgreen?style=for-the-badge&logo=leetcode)
![Easy](https://img.shields.io/badge/Easy-20-green?style=for-the-badge)
![Medium](https://img.shields.io/badge/Medium-0-yellow?style=for-the-badge)
![Hard](https://img.shields.io/badge/Hard-0-red?style=for-the-badge)

| Language / Domain | Problems Solved | Primary Topics |
|-------------------|-----------------|----------------|
| ☕ **Java** | 13 | Arrays, Two Pointers, Linear Search, Frequency Analysis, Array Manipulation |
| 🛢️ **SQL (Database)** | 7 | SELECT, Filtering, String Operations, Joins, Conditional Logic |

---

## 🛢️ SQL Problems (LeetCode)

| # | Problem Title | Difficulty | Topic | Solution Link | LeetCode Link |
|---|---------------|------------|-------|---------------|---------------|
| 1757 | Recyclable and Low Fat Products | 🟢 Easy | Basic Select / Filtering | [Solution](1908-recyclable-and-low-fat-products/recyclable-and-low-fat-products.sql) | [LeetCode](https://leetcode.com/problems/recyclable-and-low-fat-products/) |
| 584 | Find Customer Referee | 🟢 Easy | Basic Select / NULL Handling | [Solution](584-find-customer-referee/find-customer-referee.sql) | [LeetCode](https://leetcode.com/problems/find-customer-referee/) |
| 595 | Big Countries | 🟢 Easy | Basic Select / WHERE Clause | [Solution](595-big-countries/big-countries.sql) | [LeetCode](https://leetcode.com/problems/big-countries/) |
| 1148 | Article Views I | 🟢 Easy | Select / DISTINCT / Sorting | [Solution](1258-article-views-i/article-views-i.sql) | [LeetCode](https://leetcode.com/problems/article-views-i/) |
| 1683 | Invalid Tweets | 🟢 Easy | String Functions (`LENGTH`) | [Solution](1827-invalid-tweets/invalid-tweets.sql) | [LeetCode](https://leetcode.com/problems/invalid-tweets/) |
| 1378 | Replace Employee ID With The Unique Identifier | 🟢 Easy | Basic Joins (`LEFT JOIN`) | [Solution](1509-replace-employee-id-with-the-unique-identifier/replace-employee-id-with-the-unique-identifier.sql) | [LeetCode](https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier/) |
| 620 | Not Boring Movies | 🟢 Easy | Filtering / Sorting (`MOD`, `ORDER BY`) | [Solution](620-not-boring-movies/not-boring-movies.sql) | [LeetCode](https://leetcode.com/problems/not-boring-movies/) |

---

## ☕ Java DSA Problems

### 🔹 1. Array Basics & Linear Search
| # | Problem | Difficulty | Solution | Approach | Time Complexity | Space Complexity |
|---|---------|------------|----------|----------|-----------------|------------------|
| 1 | Intersection of Two Arrays | 🟢 Easy | [View Code](Array_Basic/src/Array_intersection.java) | Nested Loops / Set Matching | $O(N \times M)$ | $O(1)$ |
| 2 | Find Maximum Element in Array | 🟢 Easy | [View Code](Array_Basic/src/Maximum_ele.java) | Linear Scan | $O(N)$ | $O(1)$ |
| 3 | Search Element in Array | 🟢 Easy | [View Code](Array_Basic/src/Search_array.java) | Linear Search | $O(N)$ | $O(1)$ |
| 4 | Find Unsorted Elements | 🟢 Easy | [View Code](Array_Basic/src/Unsorted_element_in_arr.java) | Adjacent Comparison | $O(N)$ | $O(1)$ |

### 🔹 2. Two Pointers & Swapping
| # | Problem | Difficulty | Solution | Approach | Time Complexity | Space Complexity |
|---|---------|------------|----------|----------|-----------------|------------------|
| 5 | Reverse Array | 🟢 Easy | [View Code](Array_Basic/src/Array_Manipulation/Reverse_array.java) | Two Pointers (In-Place) | $O(N)$ | $O(1)$ |
| 6 | Print Extreme Elements | 🟢 Easy | [View Code](Array_Basic/src/Array_Manipulation/Print_Extrime_Ele.java) | Converging Two Pointers | $O(N)$ | $O(1)$ |
| 7 | Swap Alternate Elements | 🟢 Easy | [View Code](Array_Basic/src/Swap_alternate_element.java) | Pairwise In-Place Swap | $O(N)$ | $O(1)$ |

### 🔹 3. Array Manipulation & Simulation
| # | Problem | Difficulty | Solution | Approach | Time Complexity | Space Complexity |
|---|---------|------------|----------|----------|-----------------|------------------|
| 8 | Multiply Array Elements by 10 | 🟢 Easy | [View Code](Array_Basic/src/Multiblay_bt_10.java) | Iterative Element Scaling | $O(N)$ | $O(1)$ |
| 9 | Shift Elements Right by One Position | 🟢 Easy | [View Code](Array_Basic/src/Array_Manipulation/Shift_Element_By_one_pos.java) | Cyclic Right Shift | $O(N)$ | $O(1)$ |

### 🔹 4. Math, Aggregation & Frequency
| # | Problem | Difficulty | Solution | Approach | Time Complexity | Space Complexity |
|---|---------|------------|----------|----------|-----------------|------------------|
| 10 | Count Number of 0s and 1s | 🟢 Easy | [View Code](Array_Basic/src/Count_number_of_0_1.java) | Single Pass Counter | $O(N)$ | $O(1)$ |
| 11 | Sum and Average of Array Elements | 🟢 Easy | [View Code](Array_Basic/src/Sum.java) | Iterative Aggregation | $O(N)$ | $O(1)$ |
| 12 | Sum of Positive and Negative Numbers | 🟢 Easy | [View Code](Array_Basic/src/Sum_of_positive_negative_number.java) | Conditional Single Pass | $O(N)$ | $O(1)$ |
| 13 | Element Frequency (Highest & Lowest) | 🟢 Easy | [View Code](Array_Basic/src/Array_Manipulation/Ele_With_High_low_freq.java) | Frequency Counting | $O(N)$ | $O(N)$ |

---

## 📁 Repository Structure

```text
DSA/
├── 🛢️ SQL Problems/
│   ├── 584-find-customer-referee/
│   ├── 595-big-countries/
│   ├── 620-not-boring-movies/
│   ├── 1258-article-views-i/
│   ├── 1509-replace-employee-id-with-the-unique-identifier/
│   ├── 1827-invalid-tweets/
│   └── 1908-recyclable-and-low-fat-products/
│
├── ☕ Java Array & DSA Basics/
│   └── Array_Basic/
│       └── src/
│           ├── Array_intersection.java
│           ├── Count_number_of_0_1.java
│           ├── Maximum_ele.java
│           ├── Multiblay_bt_10.java
│           ├── Search_array.java
│           ├── Sum.java
│           ├── Sum_of_positive_negative_number.java
│           ├── Swap_alternate_element.java
│           ├── Unsorted_element_in_arr.java
│           └── Array_Manipulation/
│               ├── Ele_With_High_low_freq.java
│               ├── Print_Extrime_Ele.java
│               ├── Reverse_array.java
│               └── Shift_Element_By_one_pos.java
│
└── 📜 README.md
```

---

## 🎯 Key Learnings & Goals

- **Solidifying Fundamentals:** Practicing core array patterns (Two Pointers, Searching, Frequency Counters).
- **SQL Proficiency:** Mastering SELECT queries, WHERE filters, NULL checks, String manipulation, and JOINs.
- **Optimization:** Writing clean, optimal solutions focusing on $O(N)$ time complexity and minimal space usage.

---
⭐ *Feel free to star this repository if you find it helpful!*
