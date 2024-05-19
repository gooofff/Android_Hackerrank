import java.util.Scanner;
import java.util.zip.CRC32;

public class Day7_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            int temp = scan.nextInt();
            A[i] = temp;
        }

        for (int i = n; i >= 0; i++) {
            System.out.print(A[i] + " ");
        }
        scan.close();
    }
}
