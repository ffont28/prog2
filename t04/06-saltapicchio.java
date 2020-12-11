import java.util.Arrays;
import java.util.Scanner;

/**
 * Soluzione
 */
public class Soluzione {

    public static boolean saltapicchio (int n, int[] a) {
        for (int i=0; i < n-1; i++) {
            a[i] = Math.abs(a[i]-a[i+1]);
        }
        a[n-1] = 0;       
        Arrays.sort(a);
        for (int i=1; i < n; i++) {
            if (a[i]!=i) return false;
        }
        return true;
    }

    public static void main(final String[] args) {
        int n;
        int[] array;
        Scanner s = new Scanner(System.in);
        n = Integer.valueOf(args[0]).intValue();
        
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }
        if (saltapicchio(n,array)) System.out.println("saltapicchio");
        return;
    }
}
