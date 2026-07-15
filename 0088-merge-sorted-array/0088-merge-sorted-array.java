class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] c = new int[m+n];
        for(int ele: c) System.out.print(ele + " ");
        System.out.println();
        int k = 0;
        int i = 0, j= 0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                c[k] = nums1[i];
                i++;
                k++;
            }
            else{
                c[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i<m){
                c[k++] = nums1[i++];
            }
             while(j<n){
                c[k++] = nums2[j++];
            }
             for (int x = 0; x < m + n; x++) {
            nums1[x] = c[x];
    }}
}