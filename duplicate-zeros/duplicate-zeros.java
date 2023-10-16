class Solution {
    public void duplicateZeros(int[] arr) {
        int len = arr.length;

        int[] tmp = new int[len * 2];

        int idx = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] != 0) {
                tmp[idx++] = arr[i];
            } else {
                tmp[idx++] = 0;
                tmp[idx++] = 0;
            }
        }
        System.arraycopy(tmp, 0, arr, 0, len);
    }
}