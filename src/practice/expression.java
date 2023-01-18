package practice;

public class expression {
    public static void main(String[] args) {

       int highScore =  calculatescore(true,800,5,100);
        System.out.println("your final score was " + highScore);

         highScore = calculatescore(true,10000,8,200);
        System.out.println(" your final score was " + highScore);
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
                 return finalScore;
    }


}

