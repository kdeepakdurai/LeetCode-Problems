class Solution {
public:
    int divide(int dividend, int divisor) {


        if (dividend == INT_MIN && divisor == -1)
            return INT_MAX;

        bool negative = (dividend < 0) ^ (divisor < 0);

        long long a = llabs(dividend);
        long long b = llabs(divisor);

        long long answer = 0;

        while (a >= b) {
            long long current = b;
            long long count = 1;

            while (current + current <= a) {
                current += current;
                count += count;
            }

            a -= current;
            answer += count;
        }

        return negative ? -answer : answer;
    }
};