package RecursionMethod;


// Print  X^n (Keep the stack height =logn)
public class Prblm2 {
    public static int powerQ2(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if (n%2==0)// when n is even
        {
            return powerQ2(x,n/2)*powerQ2(x,n/2);
        }
        else{ /// when n is odd
            return powerQ2(x, n/2)*powerQ2(x,n/2)*x;
        }
    }

    public static void main(String[] args) {
        int x=2,n=5;
        int ans=powerQ2(x,n);
        System.out.println(ans);
    }
}
