import java.util.*;

class LOCKER{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();

        long n,c,n1,ans;
        for(int i=0;i<t;i++){
            n = scan.nextLong();
            c = n%3;
            if(n == 1){
                n1=0;
            }
            else if(c == 2){
                n1 = (n-2)/3;
            }
            else if(c == 1){
                n1 = (n-4)/3;
            }
            else{
                n1 = n/3;
            }
            ans = exp(3,n1);
            if(n == 1){
                ans = 1;
            }
            else if(n%3 == 2)
                ans = (ans*2)%1000000007;
            else if(n%3 == 1)
            ans = (ans*4)%1000000007;

            sb.append(ans+"\n");
        }

        System.out.println(sb);
    }

    static long exp(long a,long b){
        long m = 1000000007;
        long res = 1;
        a = a%m;
        while(b>0){
            if((b&1) == 1 )
                res = res * a %m;
            a = a*a %m;
            b>>=1;
        }

        return res;
    }
}