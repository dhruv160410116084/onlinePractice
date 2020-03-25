import java.util.*;
import java.io.*;

//solved 

class STPAR {
    public static void main (String[] args) throws Exception
	{
	    // try{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringBuilder sb = new StringBuilder();
	       
           
	        while(true){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int N = Integer.parseInt(st.nextToken());
                if(N == 0)
                    break;
                Stack<Integer> stack = new Stack<Integer>();
                int arr[] = new int[N];
                boolean flag = true;
                st = new StringTokenizer(br.readLine());
                int expected = 1;
                for(int i=0;i<N;i++){
                    arr[i] =Integer.parseInt(st.nextToken());
                }
                for(int i=0;i<N;i++){
                    while(!stack.isEmpty() && stack.peek() == expected){
                        stack.pop();
                        expected++;
                    }
                    if(arr[i] == expected  ){
                        expected++;
                    }
                //    else if( !stack.empty() && stack.peek() < arr[i]){
                //         flag = false;
                //         break;

                //    }else{
                //        stack.push(arr[i]);
                //    }
                    else{
                        if(stack.isEmpty()  || stack.peek() > arr[i]){
                            stack.push(arr[i]);
                        }else{
                            flag=false;
                            break;
                        }
                    }
                }
                if(flag)
                    sb.append("yes\n");
                else
                sb.append("no\n");

            }
                
             
System.out.print(sb);
                
                
            
            
	        
	        
	//     }catch(Exception e)
    // {
    //     System.out.println(e);
    // }
}

}
