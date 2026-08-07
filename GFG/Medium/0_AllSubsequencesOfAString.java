/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/power-set4302/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	static void getAllSubsequences(String s, int index, List<String> ans, StringBuilder output) {
		
		// Edge case
		if (index >= s.length()) {
			String subSequence = output.toString();
			ans.add(subSequence);
			return;
		}
		
		// -------------------------------- Include-Exclude Pattern --------------------------------------
		// Take the character at which index is pointed
		char c = s.charAt(index);
		// Include method
		output.append(c);
		getAllSubsequences(s, index + 1, ans, output);
		
		// Exclude method
		output.deleteCharAt(output.length() - 1);
		getAllSubsequences(s, index + 1, ans, output);
		
	}
	public List<String> powerSet(String s) {
		// Code here
		List<String> ans = new ArrayList<>();
		StringBuilder output = new StringBuilder();
		int index = 0;
		
		getAllSubsequences(s, index, ans, output);
		Collections.sort(ans);
		
		return ans;
	}
}

