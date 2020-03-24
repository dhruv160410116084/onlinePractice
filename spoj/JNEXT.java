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
                for(int i=0;i<N;i++){
                    arr[i] =Integer.parseInt(st.nextToken());
                }
                int i=0;
                for(i= N-1;i>0;i--){
                    if(arr[i]>arr[i-1])
                        break;
                }
                if(i<=0)
                    sb.append(-1+"\n");
                else{
                    int x = arr[i-1],min = i;
                    int j=0;
                    // for( j=i+1;j<N;j++){
                    //     if(arr[j] > x && arr[j] < arr[min]){
                    //         min = j;
                    //     }
                    // }
                    int temp = arr[i-1];
                    arr[i-1] = arr[min];
                    arr[min] = temp;
                    for(int k=i,d=1;k<N;k++,d++){
                        if(k != N-d){
                            
                            int t = arr[k];
                            arr[k] = arr[N-d];
                            arr[N-d] = t;
                        }
                    }
                    
                    sb.append(print(arr)+"\n");
                }
                
             

                
                
            }
            System.out.print(sb);
	        
	        br.close();
	    }catch(Exception e){
	        System.out.println(e);
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
