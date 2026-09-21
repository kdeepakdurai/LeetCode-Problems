class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            for (int j = n - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';
                int product = digit1 * digit2;
                int pos2 = i + j + 1;
                int pos1 = i + j;
                int sum = product + result[pos2];
                result[pos2] = sum % 10;
                result[pos1] += sum / 10;
            }
        }
        StringBuilder answer = new StringBuilder();
        int i = 0;
        while (i < result.length && result[i] == 0) {
            i++;
        }
        while (i < result.length) {
            answer.append(result[i]);
            i++;
        }
        return answer.toString();
    }
}