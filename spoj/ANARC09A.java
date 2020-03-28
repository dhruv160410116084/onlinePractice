import java.util.*;
import java.io.*;
import java.lang.*;


//solved
class ANARC09A {
    public static void main(String[] args) {
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            int ctr=1;
            while(true){
                Stack<Character> stack = new Stack<Character>();
                // StringTokenizer st = new StringTokenizer(br.readLine());  
                // String str = st.nextToken();
                String str = br.readLine();
                if(str.charAt(0) == '-')
                    break;
                else if(str.length() == 0){
                    sb.append(0+"\n");
                    break;
                }
                int openCounter = 0;
                int closeCounter = 0;
                int ans =0;
               

                char arr[] = str.toCharArray();

                for(int i=0;i<arr.length;i++){
                        if(arr[i] == '{'){
                            openCounter++;
                            stack.push(arr[i]);
                        }
                        if(arr[i] == '}'){
                           
                            if(stack.isEmpty()){
                                closeCounter++;
                                stack.push(arr[i]);
                            }else if( stack.peek() == '{'){
                                stack.pop();
                                openCounter--;
                            }else{
                                closeCounter++;
                                stack.push(arr[i]);
                            }
                        }
                }

            
                    int temp1 =  (int) Math.ceil((double)openCounter/2) ;
                    int temp2 = (int)Math.ceil((double)closeCounter/2);
                    int temp = temp1+temp2;
                    sb.append(ctr+". "+temp+"\n");
                    ctr = ctr+1;
                
            }
            System.out.print(sb);
            

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
