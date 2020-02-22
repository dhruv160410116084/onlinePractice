//fail

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

class COMDIV{
    static int ISPRIME = 0, NOTPRIME = 1;
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int t = scan.nextInt();
            StringBuilder sb = new StringBuilder();
            int a,b,g,count;
            for(int i=0;i<t;i++){
                a = scan.nextInt();
                b =scan.nextInt();
                count = sieveEratothenes(gcd(a,b));
                sb.append(count+"\n");
            }
            System.out.println(sb);
    }

    static int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }

    static int countDivisors(int a){
        int count = 0;
        for(int i=1;i<= a; i++){
            if(a%i == 0)
                count ++;
        }
        return count;
    }

    static int sieveEratothenes(int n){
        // System.out.println("called for n="+n);
        HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
        int arr[] = new int[n+1];
        int ans=1;
        if(n == 2){
            ans ++;
        return ans;

        }
        for(int i=2;i*i <= n ; i++){
            

            if(arr[i] == ISPRIME){
                hs.put(i,0);
                for(int j= i*i;j<=n;j+=i){
                    arr[j] = NOTPRIME;
                }
            }
        }
        Iterator<Integer> itr =hs.keySet().iterator();
        while(itr.hasNext()){
            int key = itr.next();
            // System.out.println("key :"+key);
            int count = 0;
           
            while(n % key == 0){
                n = n/key;
                count++;
            }
            ans = ans * (count+1);
            
            
        }        
        return ans;
    }
}