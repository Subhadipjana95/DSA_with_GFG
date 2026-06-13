/**
 * Problem Link : https://leetcode.com/problems/combine-two-tables/
 * Platform     : LeetCode
 * Difficulty   : Easy
 */

#include <bits/stdc++.h>
using namespace std;

# Write your MySQL query statement below
SELECT p.firstName, p.lastName, a.city, a.state FROM Person AS p LEFT JOIN Address as a ON p.personId = a.personId;
