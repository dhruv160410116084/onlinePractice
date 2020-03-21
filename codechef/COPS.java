import java.util.*;
import java.io.*;

class COPS 
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
                int m = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
               
                int arr[] = new int[m];
                int ans = 0;
                st = new StringTokenizer(br.readLine());
                int range = x*y;
                for(int i=0;i<m;i++){
                    arr[i] = Integer.parseInt(st.nextToken());
                }
                for(int i=1 ;i<=100;i++){
                    boolean safe = true;
                    for(int j=0;j<m;j++){
                       if(i >= arr[j] && (arr[j] + range) >= i){
                           safe = false;
                            break;
                       }
                        else if(i<= arr[j] && (arr[j] - range) <= i){
                            safe =false;
                            break;
                        }

                    }
                    if(safe)
                        ans++;
                }
                
                sb.append(ans+"\n");
            }
            System.out.print(sb);
	        
	        br.close();
	    }catch(Exception e){
	        // System.out.println(e);
	    }
    }
    

	
}
