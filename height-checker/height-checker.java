class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] orderedHeights = new int[n];
        
        System.arraycopy(heights, 0, orderedHeights, 0, n);
        Arrays.sort(orderedHeights);
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (heights[i] != orderedHeights[i]) ans++;
        }
        
        return ans;
    }
}