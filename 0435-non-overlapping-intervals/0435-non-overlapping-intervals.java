class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int output = 0, currEnd = intervals[0][1];
        for (int i = 1; i < intervals.length; ++i)
            if (intervals[i][0] >= currEnd) currEnd = intervals[i][1];
            else ++output;
        return output;
    }
}