import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Weird {
    public static void weird(int N) {
        if (N % 2 != 0) {
            System.out.println("Weird");
        }
        else if (2 < N && N < 5) {
            System.out.println("Not Weird");
        }
        else if (N <= 20) {
            System.out.println("Weird");
        }
        else {
            System.out.println("Not Weird");
        }
    }
}
public class Day3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        Weird.weird(N);
        bufferedReader.close();
    }
}
