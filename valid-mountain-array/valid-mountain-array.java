class Solution {
    public boolean validMountainArray(int[] arr) {
        int len = arr.length;
        int idx = 0;
        while (idx + 1 < len && arr[idx] < arr[idx+1]) {
            idx++;
        }
        
        if (idx == 0 || idx == len - 1) return false;
        
        while (idx + 1 < len && arr[idx] > arr[idx+1]) idx++;

        return idx == len - 1;
    
    }
}