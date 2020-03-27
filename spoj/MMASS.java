import java.util.*;
import java.io.*;

//solved

class MMASS {
    public static void main(String[] args) {
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());  
            String formula = st.nextToken();
            int mass = 0;
            Stack<Integer> stack = new Stack<Integer>();

            for(int i=0;i<formula.length();i++){
                char c = formula.charAt(i);
                if(Character.isAlphabetic(c)){
                    stack.push(getMass(c));
                }
                else if(Character.isDigit(c) ){
                    int top = stack.pop();
                    stack.push(top*Integer.parseInt(String.valueOf(c)));
                }else if(c == '('){
                    stack.push(-1);
                }else if(c == ')'){
                    int tempMass = 0;
                    while(stack.peek() != -1){
                        tempMass += stack.pop();
                    }
                    stack.pop();
                    stack.push(tempMass);
                }
            }

            while(!stack.isEmpty()){
                mass += stack.pop();
            }
            System.out.println(mass);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static int  getMass(char c){
        switch(c){
            case 'C': return 12;
            case 'H': return 1;
            case 'O': return 16;
            default: return -1;
        }
    }

}
