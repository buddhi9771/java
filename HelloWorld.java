import java.util.*;


class HelloWorld{




    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        // int sum = 0;

        // for(int i=1; i <= input; i++){
        //         sum = i + sum;

        // }

        // System.out.println(sum);

        //table

        // for(int i=1; i <= 10; i++){
        //       System.out.println(input*i);

        // }



        //even number print
        for(int i = 2; i <=input; i = i + 2){
           System.out.println(i);
        }

      //prime  number check
      int prime = 0;
      for(int i = 2; i <input; i = i + 1){
          prime = input % i;
          if (prime == 0){
              System.out.println("not Prime");
            break;
          }
         }

      if(prime > 0)
         System.out.println("Prime");

      if(input == 1)
         System.out.println("Not Prime");
    
      if(input == 2)
         System.out.println(" Prime");

    }
}