package project1;
import java.util.Random;
import java.util.Scanner;

public class numberguss {
   public static void main(String[] args)
         {
        Scanner Sc =new Scanner(System.in);
        Random random =new Random();
        int lowerbond =0;
        int upperbond =100;

        int Numberguss = random.nextInt(upperbond + lowerbond +1);

        int attempt =0;
        int maxattemp=10;

        while (attempt < maxattemp){
            System.out.print("Enter your guessing number = ");
            int userguess =Sc.nextInt();
            attempt ++;
            if (userguess == Numberguss) {
                System.out.println("hey correct guesses "+attempt +" your number ");
                break ;
                
            }
            else if(userguess < Numberguss) {
                System.out.println("Try to higher number ");
                break ;
                
            } else {
                System.out.println("Try to lower number ");
               
                
            }

            if (attempt == maxattemp){
                System.out.println("sorry you have reached to maximux attempts " + Numberguss);
            }
            System.out.println("THanks for playing! ");
        }
    }
    
}
