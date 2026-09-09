public class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h_index = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] > h_index)
                h_index++;
            else
                break;
        }
        return h_index;
    }
}