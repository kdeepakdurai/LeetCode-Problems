class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        final int n = s.length();
        int l = 0, r;
        int cost = 0, len = 0;
        for (r = 0; r < n; r++) {
            cost += Math.abs(s.charAt(r) - t.charAt(r));
            if (cost > maxCost) {
                cost -= Math.abs(s.charAt(r) - t.charAt(r));
                break;
            }
        }
        if (r == n && cost <= maxCost) return n;
        len = r;
        for (; r < n; r++) {
            cost += Math.abs(s.charAt(r) - t.charAt(r));
            while (cost > maxCost) {
                cost -= Math.abs(s.charAt(l) - t.charAt(l));
                l++;
            }
            len = Math.max(len, r - l + 1);
        }
        return len;
    }
}