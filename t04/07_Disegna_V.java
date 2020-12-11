import java.util.Scanner;

public class soluzione {
 public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    String space = " ";

     for (int i = n; i > 1; i--){
        System.out.println(space.repeat(n-i) + "*" + (space.repeat((i-1)*2-1)) + "*");
     }
     System.out.println(space.repeat(n-1) + "*");
 }   
}
