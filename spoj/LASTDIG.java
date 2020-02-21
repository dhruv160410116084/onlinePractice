import java.util.*;

class LASTDIG{
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int a,b,ans;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<t;i++){
			a=scan.nextInt();
			b=scan.nextInt();
			ans = exp(a,b);
			sb.append(ans+"\n");
		}
		System.out.println(sb);
	}
	
	static int exp(int a,int b){
		int m =10;
		int res = 1;
		a = a%m;
		while(b>0){
			if((b & 1) == 1)
				res = res *a % m;
			a = a*a % m;
			b>>=1;
		}
		return res;
	}
}