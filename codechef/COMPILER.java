import java.util.*;
import java.io.*;

class COMPILER 
{
	public static void main (String[] args)
	{
	    try{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringBuilder sb = new StringBuilder();
	        StringTokenizer st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());
	        while(T-- != 0){
        
                int counter = 0;
                st = new StringTokenizer(br.readLine());
                String str = st.nextToken();
                int ans = 0;
                int l = 0;
                boolean flag = true;
                for (int i=0;i<str.length();i++) {
                    if (str.charAt(i)=='<')
                        l++;
                    else{
                        if(l>0){
                            l--;
                            if(l==0)
                                ans = i+1;
                        }else{
                            break;
                        }
                       
                    }
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
