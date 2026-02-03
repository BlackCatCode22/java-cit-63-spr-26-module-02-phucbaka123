import java.util.Scanner;

public class MaddnessWithMethods {

    public static void main(String[] args) {
        System.out.println("Enter the first integer");
        int a = getAnIntFromTheUser();
        System.out.println("Enter the second integer");
        int b = getAnIntFromTheUser();
        compareTwoInts(a,b);
        int sum = sumTwoInts(a,b);
        System.out.println("Sum of these two integer is: " + sum);


}
    public static int getAnIntFromTheUser(){
        Scanner int_scanner = new Scanner(System.in);
        int input = int_scanner.nextInt();

        System.out.println(input);
        return input;
    }
    public static void compareTwoInts(int a, int b){
        if (a > b){
            System.out.println(a + " is greater than " + b);
        } else if (a < b){
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println(b + " is equal to " + a);
        }
    }
    public static int sumTwoInts(int a, int b){
        return a + b;
    }
}