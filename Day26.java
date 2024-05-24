import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day26 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int D1, D2, M1, M2, Y1, Y2, fine = 0;
        D1 = scan.nextInt();
        M1 = scan.nextInt();
        Y1 = scan.nextInt();
        D2 = scan.nextInt();
        M2 = scan.nextInt();
        Y2 = scan.nextInt();
        
        if ((Y1 - Y2) > 0) {
            fine = 10000;
        }
        else if ((Y1 - Y2) == 0) {
            if ((M1 - M2) > 0) {
                fine = 500 * (M1 - M2);
            }
            else if ((M1 - M2) == 0) {
                if (D1 - D2 > 0) {
                    fine = 15 * (D1 - D2);               
                }
            } 
        }
        System.out.println(fine);
    }
}