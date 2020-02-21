import java.util.*;
//unsolved
public class EbonyNLvory{

    static int x,y,gcd;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
         extEuc(a, b);
         System.out.println("x: "+x+" y:"+y+" gcd: "+ gcd);
         x*=c/gcd;
         y*=c/gcd;
          System.out.println("x: "+x+" y:"+y+" gcd: "+ gcd);
         if(c%gcd == 0){
             System.out.println("Yes");
         }else{
             System.out.println("No");
         }

    }

    static void extEuc(int a,int b){
        if(b==0){
            x=1;
            y=0;
            gcd = a;
        }
        else{
             extEuc(b,a%b );
            int temp = x;
            x=y;
            y=temp-(a/b)*y;
        }
    }
}