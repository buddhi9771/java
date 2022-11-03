import javax.swing.text.html.FormView;

/**
 * PatternAdvanced
 */
public class PatternAdvanced {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 4; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        int m = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                m = m + 1;
                System.out.print(m + " ");
            }
            System.out.println();
        }

        int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    
        int spaces= 0;
        for (int i = 1; i <= 5; i++) {
            
            
            spaces = 5-i;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    
   
        int sp= 0;
        for (int i = 1; i <=5; i++) {

            //spaces
            sp =  5-i;
            for (int j = 1; j <= sp ; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
   
   

        for (int i = 1; i <=4; i++) {

            //spaces
            for (int j = 1; j<= 4-i  ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 4; i >=1; i--) {

            //spaces
            for (int j = 3; j>= i  ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}