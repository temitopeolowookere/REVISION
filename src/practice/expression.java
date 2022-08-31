package practice;

public class expression {
    public static void main(String[] args) {

        calculatescore(true,800,5,100);
        calculatescore(true,10000,8,200);
    }

    public static int calculatescore(boolean gameOver,int score, int levelCompleted,int bonus){

        if (gameOver){
            return calculator(score, levelCompleted, bonus);
        }
         return -1;






    }

    private static int calculator(int score, int levelCompleted, int bonus) {
        int finalScore = score + (levelCompleted * bonus);
        finalScore+=2000;
        System.out.println(" Your final score was " + finalScore);
        return finalScore;
    }


}

