class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) {
        int index =1;
        for(int i =1;i<arr.length;i++){
        if(arr[i] != arr[i-1]) {
            arr[index++]=arr[i];
        }
        }
       return index;
    }
}