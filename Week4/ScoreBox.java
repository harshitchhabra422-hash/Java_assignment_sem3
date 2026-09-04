public class ScoreBox {
    private int score;
    public ScoreBox(int score) {
        this.score = score;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String toString() {
        return "Score: " + score;
    }
    public static void addbonus(ScoreBox scoreBox, int bonus) {
        scoreBox.setScore(scoreBox.getScore() + bonus);
    }
    static void replaceLocally(ScoreBox box)
    {
        box = new ScoreBox(0);
    }
    static ScoreBox createScoreBox(int score)
    {
        return new ScoreBox(score);
    }

}
