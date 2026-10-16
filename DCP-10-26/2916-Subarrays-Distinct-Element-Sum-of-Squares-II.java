class Solution {
    public int sumCounts(int[] nums) {
        long M = 1000000007L;
        int n = nums.length;
        long ans = 0;
        long[] cnt = new long[n + 1], tot = new long[n + 1];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int r = 0; r < n; r++) {
            int p = map.getOrDefault(nums[r], -1);
            long c = 0, s = 0;

            for (int i = n - p - 1; i > 0; i -= i & -i) {
                c += cnt[i];
                s += tot[i];
            }

            long gain = (long) (r - p) * (r - p) - 2 * (s - p * c);
            ans = (ans + (n - r) * gain) % M;

            for (int i = n - p; i <= n; i += i & -i) {
                cnt[i]++;
                tot[i] += p;
            }

            map.put(nums[r], r);
        }

        return (int) ans;
    }
}