class Solution {
    public int mySqrt(int x) { 
        int root = 0;
        for(long i = 1; i<=x; i++){
            if(i*i>x)break;
            root = (int)i;
        }
        return root;
    }
}