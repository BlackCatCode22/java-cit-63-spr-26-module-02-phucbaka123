import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args) {
        System.out.println("Enter the first integer");
        int a = getAnIntFromTheUser();
        System.out.println("Enter the second integer");
        int b = getAnIntFromTheUser();
        System.out.println("Enter the third integer");
        int c = getAnIntFromTheUser();


        System.out.println("The largest number among these 3 number is " + largest(a,b,c));
    }
    public static int getAnIntFromTheUser(){
        Scanner int_scanner = new Scanner(System.in);
        int input = int_scanner.nextInt();

        System.out.println(input);
        return input;
    }
    public static int largest(int a, int b, int c){
        int largest = a;
        if (b > largest){
            largest = b;
        }
        if (c > largest){
            largest = c;
        }
        return largest;
    }
}