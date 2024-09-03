import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,3,4,5};
        System.out.println("Enter the index of the array to print its content");
        Scanner index = new Scanner(System.in);
        try {
            System.out.println(arr[index.nextInt()]);
        } catch(ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.print("Problem with code detected " + e);
        }

    }
}