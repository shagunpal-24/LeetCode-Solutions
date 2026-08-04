class Solution {
    public int search(int[] arr, int target) {
        int n = 0;
        while(n<arr.length){
            if(arr[n] == target)
            {
                return n;
                }
            n++;
        }
        return -1;
    }
}