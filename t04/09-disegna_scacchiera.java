import java.util.Scanner;

public class soluzione {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String bianco = "-";
        String nero = "#";
        
        for (int i=0; i < 8; i++) {
            for (int k=0; k < n; k++) {
                if (i%2==0) System.out.println((bianco.repeat(n) + nero.repeat(n)).repeat(4));
                    else System.out.println((nero.repeat(n) + bianco.repeat(n)).repeat(4));
            }
//            System.out.println();
        }
    }
}
