//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> myMap = new HashMap<String,Integer>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            myMap.put(name, phone);
        }
        Vector<String> A = new Vector<>();
        while(in.hasNext()){
            String s = in.next();
            // Write code here
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