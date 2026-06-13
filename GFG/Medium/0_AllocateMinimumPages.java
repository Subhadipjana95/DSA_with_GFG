/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	static boolean isValidAns(int[] arr, int k, int maxPages) {
		int students = 1;
		int pages = 0;
		for (int i = 0; i<arr.length; i++) {
			if (pages + arr[i] <= maxPages) {
				pages += arr[i];
			}
			else {
				students++;
				if (students > k || arr[i] > maxPages) {
					return false;
				}
				else {
					pages = 0;
					pages += arr[i];
				}
			}
		}
		return true;
	}
	
	public int findPages(int[] arr, int k) {
		if (arr.length < k) {
			return - 1;
		}
		
		int n = arr.length;
		int s = 0;
		
		int sum = 0;
		for (int i = 0; i<n; i++) {
			sum += arr[i];
		}
		int e = sum;
		
		int ans = -1;
		
		while (s <= e) {
			int mid = s + (e - s)/2;
			
			if (isValidAns(arr, k, mid)) {
				ans = mid;
				e = mid - 1;
			}
			else {
				s = mid + 1;
			}
		}
		return ans;
	}
}

