import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Day20 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem); 
        }

        // Write your code here
        int numSwaps = 0;
        for (int j = 0; j < a.size(); j++) {
            for (int i = 0; i < a.size() - 1; i++) {
                if (a.get(i) > a.get(i+1)) {
                    int temp = a.get(i);
                    a.set(i,a.get(i+1));
                    a.set(i+1,temp);
                    numSwaps++;
                }
            }
            if (numSwaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(a.size() - 1));
        bufferedReader.close();
    }
}
