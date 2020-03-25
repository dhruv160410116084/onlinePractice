import java.util.*;
import java.io.*;

class InfixToPostfix {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String exp = scan.next();
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<exp.length();i++){

            if(Character.isAlphabetic(exp.charAt(i))){

                sb.append(exp.charAt(i));

            }else if ( exp.charAt(i) == '(' ||
                         stack.isEmpty() || 
                            getPrecedence(stack.peek()) < getPrecedence(exp.charAt(i)) ){
                stack.push(exp.charAt(i));
                
            }else {
                    boolean flag = false;
                    if(exp.charAt(i) == ')')
                        flag = true;
                while (  (  exp.charAt(i) == ')'  &&   !stack.isEmpty()  &&  stack.peek() != '('  ) ^  
                       (  exp.charAt(i) != ')' && exp.charAt(i)!= '('       &&   !stack.isEmpty()  &&      getPrecedence(stack.peek()) >= getPrecedence(exp.charAt(i)) ) ){
                    char c = stack.pop();
                    if(c != '(' && c != ')')
                    sb.append(c);
                }
                if(flag){
                    stack.pop();
                
                }else
                    i--;

            }
        }
        while (!stack.isEmpty()) {
                char c = stack.pop();
                // System.out.println("stack "+c);
                if(c != '(' && c != ')')
                sb.append(c);
                
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