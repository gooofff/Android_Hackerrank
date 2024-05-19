import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T;
        T = scan.nextInt();
        scan.nextLine();
        String A[] = new String[T];
        for (int i = 0; i < T; i++) {
            String S = scan.nextLine();
            A[i] = S;
        }

        for (int i = 0; i < T; i++) {
            char s[] = A[i].toCharArray();
            for (int j = 0; j < s.length; j+=2) {
                System.out.print(s[j]);
            }
            System.out.print(" ");
            for (int j = 1; j < s.length; j+=2) {
                System.out.print(s[j]);
            }
            System.out.println();
        }
        scan.close();
    }
}