class Solution {
    public int searchInsert(int[] arr, int tar) {
        int lo = 0, hi = arr.length-1, idx = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>tar)hi = mid-1;
            else if(arr[mid]==tar){
            return mid;
        }
            else {
            idx= mid;
            lo = mid +1;}
        }
        return hi+1;
    }
}