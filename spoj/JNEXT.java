import java.util.*;
import java.io.*;

//get TLE
//SOLUTION link : youtube next higher number 

class JNEXT 
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
                int arr[] = new int[N];
                st = new StringTokenizer(br.readLine());
                boolean flag = false;
                for(int i=0;i<N;i++){
                    arr[i] =Integer.parseInt(st.nextToken());
                }
                
                int a=arr[N-1];
                int b =0;
                int d1=0;
                for(int i=N-2;i>=0;i--){
                    b=arr[i];
                    if(b<a){
                        d1=i;
                        flag = true;
                        break;
                    }else
                        a=b;
                }
                if(flag){
                    int temp = arr[d1];
                    int diff = 0;
                    int min_diff = 0;
                    int d2=0;
                    for(int i=d1+1;i<N;i++){
                        diff = arr[i] - arr[d1];
                        if(i == d1+1){
                            min_diff = diff;
                            d2 = i;
                        }
                        else if(diff >-1 && min_diff>diff){
                            min_diff = diff;
                            d2 = i;
                        }
                    }
                    int temp_ = arr[d1];
                    arr[d1] = arr[d2];
                    arr[d2]=temp_;
    
                    Arrays.sort(arr,d1+1,arr.length);
                    String s =print(arr);
                    sb.append(s+"\n");
    
    
                }
                else 
                sb.append(-1+"\n");

                
                
            }
            System.out.print(sb);
	        
	        br.close();
	    }catch(Exception e){
	        // System.out.println(e);
	    }
    }

    static String print(int arr[]){
        String str = "";
        for(int i=0;i<arr.length;i++){
            // System.out.print(arr[i]);
            str = str+arr[i];
        }
        // System.out.println();
        return str;
    }
    

	
}
