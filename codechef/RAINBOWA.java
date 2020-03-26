import java.util.*;
import java.io.*;


//solved
class RAINBOWA 
{
	public static void main (String[] args)
	{
		try{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringBuilder sb = new StringBuilder();
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        int T = Integer.parseInt(st.nextToken());
	        while(T-- != 0){
	            st = new StringTokenizer(br.readLine());
	            int N = Integer.parseInt(st.nextToken());
	            st = new StringTokenizer(br.readLine());
				int arr[] = new int[N];
				for(int i=0;i<N;i++){
					arr[i] = Integer.parseInt(st.nextToken());
				}
				int prev = 0;
				for(int i=0;i<=N/2;i++){
					if(arr[i] != arr[N-i-1])
						break;
					if(arr[i] != prev && arr[i] != prev+1)
						break;
					prev = arr[i]; 
				}
				if(prev == 7)
					sb.append("yes\n");
				else
					sb.append("no\n");
			}
			
             System.out.print(sb);
	        
	        br.close();
	    }catch(Exception e){
	        System.out.println(e);
	    }
	}
	
}
