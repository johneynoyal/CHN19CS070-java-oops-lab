import java.io.*;
import java.util.*;
public class Odd_or_Even {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int x = scan.nextInt();
        //Checking if num is odd or even
        if (x % 2 ==0)
        System.out.printf("%d is an even number \n",x);
        else 
        System.out.printf("%d is an odd number \n",x);
        scan.close();
    }
}
