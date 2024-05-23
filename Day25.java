import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day25 {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        ArrayList<Double> n = new ArrayList<>(); 
        while (T-- > 0) {
            Double item = scan.nextDouble();
            n.add(item);
        }
        for (int i = 0; i < n.size(); i++) {
            Double temp = n.get(i);
            int check = 1;
            if (temp <= 1 ) {
                System.out.println("Not prime");
                continue;
            }
            for (int j = 1; j <= Math.sqrt(temp); j++) {
                if (temp % j == 0) {
                    check++;
                }
            }
            if (check == 2) {
                System.out.println("Prime");
            }
            else {
                System.out.println("Not prime");
            }
        }
    }
}



