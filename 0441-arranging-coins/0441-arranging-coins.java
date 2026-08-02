class Solution {
      public int sqrt(long n) { 
        int root = 0;
        for(long i = 1; i<=n; i++){
            if(i*i>n)break;
            root = (int)i;
        }
        return root;
    }
    public int arrangeCoins(int n) {
        return (sqrt((long)8 * n + 1) - 1) / 2;
    }
}