package Entity;

import Constant.QuestionDifficulty;

public class Question {

    public static int id = 0;
    QuestionDifficulty.DifficultyLevel difficultyLevel;
    int score;

    public Question(QuestionDifficulty.DifficultyLevel difficultyLevel, int score) {
        this.difficultyLevel = difficultyLevel;
        this.score = score;
        this.id++;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Question.id = id;
    }

    public QuestionDifficulty.DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(QuestionDifficulty.DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
