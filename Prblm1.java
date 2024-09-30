package RecursionMethod;

// Print  X^n (Keep the stack height =n)
public class Prblm1 {
    public static int PowerQ(int x, int n) {
        if (n == 0) {
            return 1;   ///Base condition 1
        }
        if (x == 0) {
            return 0;  // Base condition 2
        }
        int r1 = PowerQ(x, n - 1);
        int res = x * r1; /// work
        return res;
    }
    public static void main(String[] args) {
        int x = 2, n = 4;    /// Given
        int ans = PowerQ(x, n);
        System.out.println(ans);
    }

}