import java.util.*;
import java.io.*;



class FRGTNLNG 
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
                int K = Integer.parseInt(st.nextToken());
                st = new StringTokenizer(br.readLine());
                String oldWords[] = new String[N];
                boolean foundWords[] = new boolean[N];

                for(int i=0;i<N;i++){
                    oldWords[i] = st.nextToken(); 
                }
                for(int i=0;i<K;i++){
                    st = new StringTokenizer(br.readLine());
                    int L = Integer.parseInt(st.nextToken());
                    String mordernWords[] = new String[L];
                    for(int j=0;j<L;j++){
                        mordernWords[j] = st.nextToken();
                    }
                    
                    for(int k=0;k<N;k++){
                        for(int l=0;l<L;l++){
                            // System.out.println(oldWords[k] +"   "+mordernWords[l]);
                            if(oldWords[k].equals(mordernWords[l])  ){
                                foundWords[k] = true;
                            }
                        }
                    }
                }

                for(int i=0;i<N;i++){
                    if(foundWords[i])
                        sb.append("YES ");
                    else
                        sb.append("NO ");
                }
	          sb.append("\n");
            }
            System.out.print(sb);
	        
	        br.close();
	    }catch(Exception e){
	        
	    }
    }
    
    // static print(String arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.println(arr[i]+" ");
    //     }
    //     System.out.println();
    // }
	
}
