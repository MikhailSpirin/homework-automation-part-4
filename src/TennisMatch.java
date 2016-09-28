/**
 * Created by mikhails on 28.09.2016
 */
public class TennisMatch {

    private Player firstPlayer;
    private Player secondPlayer;
    private Judge judge;
    public final int SCORES_TO_WIN_MATCH = 5;

    public TennisMatch(String judgeName, String firstPlayerName, String secondPlayerName) {
        firstPlayer = new Player(firstPlayerName);
        secondPlayer = new Player(secondPlayerName);
        judge = new Judge(judgeName);
        System.out.println("Match started!");
    }

    class Judge {
        public Judge(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        private String name;
    }

    class Player {
        public Player(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
        private String name;
        public int getScore() {
            return score;
        }
        public void addPoint() {
            score++;
        }
        private int score = 0;
    }

    // methods for business logic

    public void firstPlayerScored(){
        firstPlayer.addPoint();
        System.out.println("Player 1 scored");
        checkPoints();
    }

    public void secondPlayerScored(){
        secondPlayer.addPoint();
        System.out.println("Player 2 scored");
        checkPoints();
    }

    public void checkPoints() {
        if (firstPlayer.getScore() >= SCORES_TO_WIN_MATCH)
            System.out.println(String.format("Player 1 - %s wins!", firstPlayer.getName()));
        if (secondPlayer.getScore() >= SCORES_TO_WIN_MATCH)
            System.out.println(String.format("Player 2 - %s wins!", secondPlayer.getName()));
        if (firstPlayer.getScore() == secondPlayer.getScore())
            System.out.println(String.format("Judge (%s) says: It's a tie!", judge.getName()));
    }

    public void getCurrentScore() {
        System.out.println(String.format("Score is: %s - %s", firstPlayer.getScore(), secondPlayer.getScore()));
    }

}
