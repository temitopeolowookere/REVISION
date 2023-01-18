package practice;

public class playerPositions {

    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("temitope", highScorePosition);

         highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("olayinka", highScorePosition);

         highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("dorris", highScorePosition);

         highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("benjamin", highScorePosition);

    }

    public static void displayHighScorePosition( String playerName, int HighScorePosition){
        System.out.println(playerName + " managed to get into position " + HighScorePosition + " on the highscore table");
    }

    public static  int calculateHighScorePosition(int playerScore) {
        return PositionCalculation(playerScore);

    }

    private static int PositionCalculation(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
