import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Please enter your name: ");
        Scanner name_scanner = new Scanner(System.in);
        String name = name_scanner.next();

        String reverse_name = "";
        for (int i = name.length() - 1; i >= 0; i--){
            reverse_name = reverse_name + name.charAt(i);
        }

        System.out.println(reverse_name);
    }

}
