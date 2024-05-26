import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Day28 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> gmailUsers = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b(\\w+)@gmail.com\\b");
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            String firstName = firstMultipleInput[0];

            String emailID = firstMultipleInput[1];
            Matcher matcher = pattern.matcher(emailID);
            if (matcher.find()) {
                gmailUsers.add(firstName);
            }
        }
        Collections.sort(gmailUsers);

        for (String name : gmailUsers) {
            System.out.println(name);
        }
        bufferedReader.close();
    }
}
