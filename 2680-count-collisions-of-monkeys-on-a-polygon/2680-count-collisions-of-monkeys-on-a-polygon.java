class Solution {
    public int monkeyMove(int n) {
        long mod = 1000000007;
        long pow = modPow(2, n, mod);
        return (int)((pow - 2 + mod) % mod);
    }

    private long modPow(long base, int exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
}
