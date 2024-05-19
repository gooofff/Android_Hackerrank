import java.util.Scanner;

public class Day6_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine(); // Đọc bỏ dòng trống sau khi đọc số lượng test cases
        
        for (int t = 0; t < T; t++) {
            String S = scan.nextLine();
            printEvenOddCharacters(S);
        }
        
        scan.close();
    }
    
    // Phương thức in ra ký tự ở vị trí chẵn và lẻ của chuỗi
    private static void printEvenOddCharacters(String str) {
        char[] s = str.toCharArray();
        for (int j = 0; j < s.length; j += 2) {
            System.out.print(s[j]);
        }
        System.out.print(" ");
        for (int j = 1; j < s.length; j += 2) {
            System.out.print(s[j]);
        }
        System.out.println();
    }
}