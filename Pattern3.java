public class Pattern3 {
   public static void main(String[] args) {

        int m = 4;
        int n = 4;
       for (int i = 5; i >0  ; i--) {
        //    for (int j = 0; j < 5; j++) {
        //      if(i<=j){
        //         System.out.print("* ");
        //      }else{
        //         System.out.print("  ");
        //      }
    
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j >4 ; j++) {
                System.out.print("* ");
            }

           }
           System.out.println();
       }
   } 
}
