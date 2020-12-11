import java.util.Scanner;

public class soluzione {
   
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       String astr = "*";
       String sp = " ";

       for (int i=0; i < n; i++){
           System.out.println(sp.repeat(n-i) + astr.repeat(i*2+1));
       }
       for (int i=n; i >= 0; i--){
           System.out.println(sp.repeat(n-i) + astr.repeat(i*2+1));
       }
   } 
}
