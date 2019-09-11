import java.util.Random;
import java.util.Scanner;

class Game {

    //This method starts the game
    void start() throws GuessNumberException{

        //Player's move
        System.out.println("\nType in a number between 1 and 5: ");
        Scanner scanner = new Scanner(System.in);
        int playersInt = scanner.nextInt();
        if (playersInt < 0 || playersInt > 5) throw new GuessNumberException("You must type numbers ONLY in range of 1-5!");

        //Receiving a random number
        Random random = new Random();
        int computerInt = random.nextInt(5) + 1;
        System.out.println("\nAnd the number is...\n" + computerInt);

        //'result' method call
        result(playersInt, computerInt);

        //Restart
        restart();
    }

    ////This method sets the equality of a player's number and a random number
    static void result(int a, int b){
        if (a != b){
            System.out.println("\nUnfortunately you did not guess... :(");
        }else
            System.out.println("\nCorrect! You're the lucky winner! :)");
    }

    //This method restarts the game if the player wants so
     void restart()throws GuessNumberException{
        System.out.println("\nWanna play again? ('y' or 'n')");
        Scanner restartScanner = new Scanner(System.in);
        String restartString = restartScanner.nextLine();
        if (restartString.equals("y")){
            start();
        }else if (restartString.equals("n")){
            System.out.println("See you next time! ;)");
            return;
        }else {
            System.err.println("Only 'y' or 'n' letters are allowed!");
            restart();
        }
    }
}
