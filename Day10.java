import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Day10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String bin = Integer.toBinaryString(n);
        int check = 0, max = 0;
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {
                check += 1;
            }
            else {
                max = Math.max(check,max);
                check = 0;
            }
        }
        max = Math.max(check,max);
        System.out.println(max);
        bufferedReader.close();
    }
}
