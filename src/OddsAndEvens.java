import java.util.*;

public class OddsAndEvens {
    public static void main(String[] args){

        /*
        PART 1 - Pick odds or even
        */
        Scanner sc = new Scanner(System.in);

        System.out.println("Let's play a game called \"Odds and Even\"");
        System.out.print("What is your name?");
        String name = sc.nextLine();

        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens?");
        String choice = sc.next();

        //If-else loop to set computer
        if(choice.equals("O")){
            System.out.println(name + " has picked odds! The computer will be evens");
        }
        else{
            System.out.println(name + " has picked evens! The computer will be odds.");
        }

        System.out.println("----------------------------------");

        //------------------------------------------------------------------
        //PART 2 - Play the Game
        Random rand = new Random();

        System.out.print("How many \"fingers\" do you put out?");
        int fingers = sc.nextInt();
        int computer = rand.nextInt(6);

        System.out.println("Computer plays " + computer + " fingers");

        System.out.println("------------------------------------");

        //-------------------------------------------------------------------

        //PART 3
        int sum = fingers + computer;
        boolean odd_or_even = (sum%2 == 0);
        System.out.println(fingers + " + " + computer + " = " + sum);

        if(odd_or_even){
            System.out.println(sum + " is ...Even");
            if(choice.equals("E")){
                //The user wins
                System.out.println(name + " is the winner!");
            }
            else System.out.println("The computer wins!");
        }
        else {
            System.out.println(sum + " is ...Odd");
            if(choice.equals("O")){
                //The user wins
                System.out.println(name + " is the winner!");
            }
            else System.out.println("The computer wins!");
        }
        System.out.println("------------------------------------");

        //-------------------------------------------------------------------






    }
}
