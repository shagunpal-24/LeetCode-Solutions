class Solution {
    public boolean searchMatrix(int[][] arr, int tar) {
        int rows = arr.length; 
        int cols = arr[0].length;
        int lo = 0, hi = rows*cols - 1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            int midRow = mid/cols, midCols = mid%cols;
            if(arr[midRow][midCols] == tar){
                return true;
            }
            else if(arr[midRow][midCols] > tar) hi = mid- 1;
            else lo = mid + 1;
        }
        return false;
    }
}