import java.util.*;

class ZSUM{
    public static void main(String[] args) {
        long n,k;
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        long mod = 10000007;

        while(true){
            n = scan.nextLong();
            k = scan.nextLong();
            if( n==0 && k==0)
                break;
            else
                {
                    long a = 2*exp(n-1,k);
                    long b = 2*exp(n-1,n-1);
                    long c = exp(n,k);
                    long d = exp(n,n);
                    long ans = (a+b+c+d)%mod;
                    sb.append(ans+"\n");

                }
        }

        System.out.println(sb);
    }

    static long exp (long a,long n){
        long mod = 10000007;
        long res = 1;
        a%=mod;
        while(n>0){
            if((n&1) == 1)
                res = res * a%mod;
            a = a*a % mod;
            n = n>>1;
        }
        return res;
    }
}