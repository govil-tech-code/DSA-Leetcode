class Solution {
    public boolean isPowerOfThree(int n) {
       int i;
       long c=1;
       if(n<=0) {
        return false;
       }
       if(n==1) {
        return true;
       }
       for(i=0; i<n; i++) {
       c=c*3;
      if(c==n) {
         return true;
      }
      if(c>n) {
        return false;
      }
       }
        return false;
    }
}