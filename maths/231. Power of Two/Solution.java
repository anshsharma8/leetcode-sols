class Solution {
    public boolean isPowerOfTwo(int n) {
      if(n<=0)
      {
        return false;
      }
        int x=n & n-1;
    if(x>=1)
       {
        return false;
       }

       else return true;
    }
}
