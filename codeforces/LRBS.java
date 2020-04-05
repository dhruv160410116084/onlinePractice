import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class LRBS {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Integer> st = new Stack<Integer>();
        int N = str.length();
        int s[] = new int[N];
        int e[] = new int[N];
        int f[] = new int[N+1];
        f[0]=1;
        int _max=0;
        
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '(')
                st.push(i);
            else{
                int startIdx =0;
                if(st.empty()){
                    s[i] = e[i] = -1;
                }
                else{
                     startIdx = st.pop();
                    s[i]=e[i] = startIdx;
                    if(startIdx >0 && str.charAt(startIdx-1) == ')' && s[startIdx-1] >=0)
                    e[i] = e[startIdx-1];
                    int l =  i - e[i]+1;
                    f[l]++;
                    _max=max(_max,l);
                }
                }
                
        }
        

        System.out.println(_max + " " + f[_max]);
    }
}

// (()())()(())()()()
// ) -------------------------------------
// ()
// ) ----------------------------------------
// ()
// ((---------------------------------
/* ()(()(())()()()) */
// ( -----------------------------------
/* (()(())()(()()()()))()(())() */
// (( ---------------------------------------
/* (()())() */
// ( ------------------------------------------
/* ()((())()(())(())) */
