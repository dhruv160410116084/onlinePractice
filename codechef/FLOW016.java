import java.util.Scanner;

class FLOW016{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        long a,b,gc,lcm;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<t;i++){
            a = scan.nextLong();
            b = scan.nextLong();
            gc = gcd(a,b);
            lcm = (a*b)/gc;
            sb.append(gc+" "+lcm+"\n");
        }
        System.out.println(sb);
    }

    static long gcd(long a , long b){
        if(b == 0)
            return a;
        else 
            return gcd(b,a%b);
    }
}