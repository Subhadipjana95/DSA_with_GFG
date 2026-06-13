/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
	public char getMaxOccuringChar(String s) {
		int[] freq = new int[26];
		for (int i = 0; i<s.length(); i++) {
			char currChar = s.charAt(i);
			freq[currChar - 'a']++;
		}
		
		int max = -1;
		char ans = 'a';
		for (int i = 0; i<26; i++) {
			if (freq[i] > max) {
				max = freq[i];
				ans = (char)(i + 'a');
			}
		}
		return ans;
	}
}

