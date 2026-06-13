/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/aggressive-cows/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	static boolean isValid(int[] arr, int k, int minDistance) {
		int cowCount = 1; // Default it would be 1 at starting
		int position = 0; // Default 1st cow's position would be 0th
		for (int i = 1; i<arr.length; i++) {
			if (arr[i] - arr[position] >= minDistance) { // Current Cow and last Cow's distance is greater than minDistance
				cowCount++;
				position = i; // Position asign to the current cow
				if (cowCount == k) { // Don't proceed if cowCount matches with given Cows Number
					return true;
				}
			}
		}
		return false;
	}
	
	public int aggressiveCows(int[] stalls, int k) {
		Arrays.sort(stalls); // Sort the Given Array
		int n = stalls.length;
		
		int s = 0;
		int e = stalls[n-1] - stalls[0]; // Total Distance from starting to ending stall
		int ans = -1;
		
		while (s <= e) {
			int mid = s + (e - s)/2;
			
			if (isValid(stalls, k, mid)) {
				ans = mid;
				s = mid + 1;
			}
			else {
				e = mid - 1;
			}
		}
		return ans;
	}
}

