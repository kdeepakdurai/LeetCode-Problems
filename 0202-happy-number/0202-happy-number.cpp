static const int _ = [](){ios_base::sync_with_stdio(false);cin.tie(NULL);return 0;}();
class Solution {
public:
    bool isHappy(int n) {
        auto next = [](int n) {
            int sum = 0;
            while (n) { int d = n % 10; sum += d * d; n /= 10; }
            return sum;
        };
        int slow = n, fast = next(n);
        while (fast != 1 && slow != fast) {
            slow = next(slow);
            fast = next(next(fast));
        }
        return fast == 1;
    }
};