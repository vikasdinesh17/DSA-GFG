class Solution {
    int missingNum(int arr[]) {

        int sum =0;
        int totalsum =0;
        for(int i = 0;i<n+1;i++){
            totalsum = totalsum + (i+1);
        }
        for(int i = 0;i<arr.length;i++){
            sum = sum +arr[i];
        }
    return totalsum-sum;
    }
}