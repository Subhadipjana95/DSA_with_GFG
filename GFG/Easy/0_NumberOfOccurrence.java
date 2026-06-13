/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/number-of-occurrence2259/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
	static int lowerBound(int arr[], int target) {
		int n = arr.length;
		int low = 0;
		int high = n - 1;
		int ans = n;
		while (low <= high) {
			int mid = low + (high - low)/2;
			if (arr[mid] >= target) {
				ans = mid;
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return ans;
	}
	
	static int upperBound(int arr[], int target) {
		int n = arr.length;
		int low = 0;
		int high = n - 1;
		int ans = n;
		while (low <= high) {
			int mid = low + (high - low)/2;
			if (arr[mid] <= target) {
				low = mid + 1;
			}
			else {
				ans = mid;
				high = mid - 1;
			}
		}
		return ans;
	}
	
	int countFreq(int[] arr, int target) {
		int lower = lowerBound(arr, target);
		int upper = upperBound(arr, target);
		return (upper - lower);
	}
}

