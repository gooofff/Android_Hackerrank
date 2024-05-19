//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Day8{
    public static void main(String []argh) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> myMap = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            String[] arrTemp = line.trim().split("\\s+");
            
            String name = arrTemp[0];
            int phone = Integer.parseInt(arrTemp[1]);
            // Write code here
            myMap.put(name, phone);
        }
        in.nextLine();
        Vector<String> A = new Vector<>();
        while(in.hasNextLine()){ // Đọc tới khi không còn dữ liệu nào nữa để đọc
            String s = in.nextLine();
            // Write code here
            if (s.isEmpty()) {
                break;
            }
            A.add(s);
        }
        for (String string : A) {
            if (myMap.containsKey(string)) {
                System.out.println(string + "=" + myMap.get(string));
            }
            else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}