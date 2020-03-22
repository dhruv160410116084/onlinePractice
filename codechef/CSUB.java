import java.util.*;
import java.io.*;

class CSUB {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());
            while(T-- != 0){
                st = new StringTokenizer(br.readLine());
                int N = Integer.parseInt(st.nextToken());
                st = new StringTokenizer(br.readLine());
                String str = st.nextToken();
                char arr[] = str.toCharArray();
                int count = 0;
                long ans = 0;
                for(int i=0;i<arr.length;i++){
                    if(arr[i] == '1'){
                        count++;
                        ans += count;
                    }
                }
                // count = (count*(count+1))/2;
                sb.append(ans+"\n");
            }
            System.out.print(sb);
           
          
            br.close();
        } catch (Exception e) {
            // System.out.println(e);
        }
    }
}

