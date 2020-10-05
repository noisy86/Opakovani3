import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter String: ");
        String myStr = str.nextLine();
        for (int i = 0; i < myStr.length(); i++) {
            System.out.println(myStr.charAt(i));
        }
    }
}
