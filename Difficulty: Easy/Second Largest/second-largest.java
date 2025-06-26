class Solution {
    public int getSecondLargest(int[] arr) {
    int largest = arr[0],secondLargest = Integer.MIN_VALUE;
    
    for(int i=1;i<arr.length;i++){
        if(arr[i]>largest){
            secondLargest = largest;
            largest = arr[i];
        }else if(arr[i]>secondLargest && arr[i] != largest){
            secondLargest = arr[i];
        }else if(secondLargest== Integer.MIN_VALUE){
            secondLargest = -1;

        }
    }
     return secondLargest;   
    }
}