class Solution {
    static boolean searchInSorted(int arr[], int k) {
        int low = 0, high = arr.length - 1, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == k) {
                return true;
            } else if (arr[mid] > k) {
                high = mid - 1; // Corrected
            } else {
                low = mid + 1;  // Corrected
            }
        }
        return false;
    }
}
