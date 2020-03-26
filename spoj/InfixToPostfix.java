import java.util.*;
import java.io.*;

//solved but with the help of gfg

class InfixToPostfix {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
       int T = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();

        while(T-- != 0){
            st =new StringTokenizer(br.readLine());
        String exp = st.nextToken();
        for(int i=0;i<exp.length();i++){

            if(Character.isAlphabetic(exp.charAt(i))){

                sb.append(exp.charAt(i));

            }else if ( exp.charAt(i) == '(' ){
                stack.push(exp.charAt(i));
                
            }else if( exp.charAt(i) == ')'){
                while(!stack.isEmpty() && stack.peek() != '(')
                    sb.append(stack.pop());
                if(!stack.isEmpty() && stack.peek() == '(')
                    stack.pop();
            }else{
                while(!stack.isEmpty() && getPrecedence(exp.charAt(i)) <= getPrecedence(stack.peek())){
                    if(stack.peek() != '(')
                        sb.append(stack.pop());
                }
                stack.push(exp.charAt(i));
            }
        }
        while (!stack.isEmpty()) {
                char c = stack.pop();
                // System.out.println("stack "+c);
                if(c != '(' && c != ')')
                sb.append(c);
                
        }
        sb.append("\n");
        }

        

        System.out.println(sb);

    }

    static int getPrecedence(char c){
        switch (c) {
            case '+':
            case '-':    
                return 1;
            case '*':
            case '/':    
                return 2;

            case '^':
                return 3;
            default :
                return -1;
        }
    }
}