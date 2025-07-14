// User function Template for Java

class Solution {
    long solve(int n, long A[], long b) {
        for(int i=0;i<A.length;i++){
            
            if(A[i]==b){
               b = 2 *b;
            }
        }
        return b;
    }
}