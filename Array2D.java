import java.util.*;

public class Array2D {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter rows and columns :");
    int rows = scan.nextInt();
    int cols = scan. nextInt();

    int[][] array2D = new int[rows][cols];

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            array2D[i][j] = scan.nextInt();
        }
    }
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
          System.out.print(array2D[i][j]+" ");
        }
        System.out.println();
    }

    System.out.println("Finding postion of array element ");
    System.out.println("Please enter element");
    int element = scan.nextInt();

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
         if(array2D[i][j]==element){
             System.out.println("postion of element is "+"(" +i + " , " + j+")");
         }
        }
    }

  }  
}
