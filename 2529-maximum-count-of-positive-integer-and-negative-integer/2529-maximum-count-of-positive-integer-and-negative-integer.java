class Solution {
    public int maximumCount(int[] arr) {
        int negCount = binarySearch(arr, 0);
        int posCount = arr.length - binarySearch(arr, 1);
        return Math.max(negCount, posCount);
    }

    private int binarySearch(int[] arr, int target) {
        int n = arr.length;
        int lo = 0, hi = n - 1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]<target) lo = mid + 1;
            else {
                n = mid; 
                hi = mid - 1;}
        }
        return n;
    }
}