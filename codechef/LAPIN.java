import java.util.*;
import java.io.*;

class LAPIN {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());
            while(T-- != 0){
                st = new StringTokenizer(br.readLine());
                String str = st.nextToken();
                int N = str.length();
                HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
                boolean found = true;
                for(int i=0;i<N;i++){
                    if(N%2 == 0 && i<N/2){
                        if(hm.containsKey(str.charAt(i))){
                            int temp_count = hm.get(str.charAt(i));
                            hm.put(str.charAt(i),temp_count+1);
                        }else{
                            hm.put(str.charAt(i),1);
                        }
                    }
                    else if(N%2 != 0 && (i<N/2)){
                        
                        if(hm.containsKey(str.charAt(i))){
                            int temp_count = hm.get(str.charAt(i));
                            hm.put(str.charAt(i),temp_count+1);
                        }else{
                            hm.put(str.charAt(i),1);
                        }
                    }
                    else{
                        if(hm.containsKey(str.charAt(i))  ){
                                if( N%2 == 0 ||   (N%2 != 0 && i > N/2)){
                                    int temp_count = hm.get(str.charAt(i));
                                    hm.put(str.charAt(i),temp_count-1);         

                                }
                        }
                        else if(N%2 !=0 && i == N/2){
                            
                        }
                        else
                            found = false;
                    }

                }

                if(found == false)
                    sb.append("NO\n");
                else{
                    for(Map.Entry<Character,Integer> entry : hm.entrySet() ){
                            if(entry.getValue() != 0)
                                found=false;
                    }
                    if(found == false){
                        sb.append("NO\n");
                    }
                    else
                        sb.append("YES\n");
                  

                }
      
            }
            System.out.print(sb);
           
          
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

