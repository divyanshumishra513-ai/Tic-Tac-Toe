import java.util.Random;

public class UC2_Toss {

    public static void main(String[] args) {

        Random rand = new Random();

        int toss = rand.nextInt(2); // 0 or 1
        char player1Symbol, player2Symbol;
        String currentPlayer;

        if (toss == 0) {
            currentPlayer = "Player 1";
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = "Player 2";
            player1Symbol = 'O';
            player2Symbol = 'X';
        }

        System.out.println("Toss Result: " + currentPlayer + " starts first!");
        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
    }
}
