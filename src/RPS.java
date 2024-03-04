import java.util.Scanner;
public class RPS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String moveA;
        String moveB;
        boolean playAgain = true;

        while (playAgain){
            System.out.println("Enter move for Player A (R/P/S): ");
            moveA = in.nextLine().toUpperCase();

            while (!validMove(moveA))
            {
                System.out.println("Invalid move! Please enter R, P, or S:");
                moveA = in.nextLine().toUpperCase();
            }

            System.out.println("Enter move for Player B (R/P/S): ");
            moveB = in.nextLine().toUpperCase();

            while (!validMove(moveB))
            {
                System.out.println("Invalid move! Please enter R, P, or S:");
                moveB = in.nextLine().toUpperCase();
            }

            System.out.println("Player A chose: " + moveA);
            System.out.println("Player B chose: " + moveB);

            if (moveA.equals(moveB))
            {
                System.out.println("It's a tie!");
            }
            else if ((moveA.equals("R") && moveB.equals("S")) || (moveA.equals("P") && moveB.equals("R") || moveA.equals("S") && moveB.equals("P")))
            {
                System.out.println(winningPhrase(moveA) + "Player A wins!!");
            }
            else
            {
                System.out.println(winningPhrase(moveB) + "Player B wins!!");
            }

            System.out.println("Do you want to play again? (Y/N): ");
            String playAgainResponse = in.nextLine().toUpperCase();
            playAgain = playAgainResponse.equals("Y");
            if (playAgainResponse.equals("N")) {
                playAgain = false;
                System.out.println("Thank you! Play again soon!!");
            }
        }
    }

    public static boolean validMove(String move)
    {
        return move.equals("R") || move.equals("P") || move.equals("S");
    }

    public static String winningPhrase(String move)
    {
        if (move.equals("R")) {
            return "Rock breaks Scissors. ";
        } else if (move.equals("P")) {
            return "Paper covers Rock. ";
        }
        else {
            return "Scissors cuts Paper. ";

        }
    }
}
