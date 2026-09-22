class Solution {
    public String intToRoman(int s) {

        int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };

        String[] roman = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };

        String result = "";

        for (int i = 0; i < values.length; i++) {

            while (s >= values[i]) {
                result += roman[i];
                s -= values[i];
            }
        }

        return result;
    }
}