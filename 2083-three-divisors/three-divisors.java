class Solution {
    public boolean isThree(int n) {
        int m=1;
        int count=0;
        while(m<=n) {
         if(n%m==0) {
            count++;
         }
         m++;
        }
        if(count==3) {
            return true;
        }
        return false;
    }
}