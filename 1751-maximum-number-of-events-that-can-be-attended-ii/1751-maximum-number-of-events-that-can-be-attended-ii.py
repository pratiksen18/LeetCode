class Solution:
    def maxValue(self, events: List[List[int]], k: int) -> int:
        sortedEvents = sorted(events)
        @functools.lru_cache(None)
        def helper(count, k):
            if k == 0 or count == len(sortedEvents): return 0
            bi = bisect.bisect(sortedEvents, [sortedEvents[count][1], math.inf, math.inf], count + 1)
            return max(helper(count + 1, k), sortedEvents[count][2] + helper(bi, k - 1))
        return helper(0, k)