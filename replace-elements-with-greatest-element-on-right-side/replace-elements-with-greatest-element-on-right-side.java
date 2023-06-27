class Solution {
    public int[] replaceElements(int[] arr) {
        int max = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - 1) {
                max = arr[i];
                arr[i] = -1;
                continue;
            }
            int tmp = arr[i];
            arr[i] = max;
            if (tmp > max) max = tmp;
        }
        return arr;
    }
}