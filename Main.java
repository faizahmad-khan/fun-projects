import java.util.Scanner;

public class Main{
     public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;

        do {
            System.out.println("Guess my number (between 1 and 100): ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber){
                System.out.println("Congratulations! You've guessed the number.");
                break;
            } 
            else if(userNumber > myNumber){
                System.out.println("My number is higher. Try again.");
            } 
            else {
                System.out.println("My number is lower. Try again.");
            }
        } while(userNumber >=0);

        System.out.print("My number was:");
        System.out.println(myNumber);
     }
}
    
