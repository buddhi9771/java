import java.util.*;

public class Array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array");
        int inputSize = scan.nextInt();

        int[] array = new int[inputSize];

        int[] array2 = {2,3,6,7};
      

        for (int i = 0; i < inputSize; i++) {
            array[i] = scan.nextInt();
        }

        for (int i = 0; i < inputSize; i++) {
        System.out.print(array[i]+" ,");
        }
        System.out.println();
        System.out.println("Now Print array 2:");
        for (int i = 0; i <= array2.length; i++) {
            System.out.print(array2[i]+", ");
            }
    }
}