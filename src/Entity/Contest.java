package Entity;

import Constant.ContestDifficulty;
import Constant.QuestionDifficulty;

import java.util.ArrayList;
import java.util.List;

public class Contest {

    String contestName;
    public static int id = 0;
    User user;

    List<Question>questionList;

    ContestDifficulty.ContestLevel difficultyLevel;
    List<User>userList;

    public Contest(String contestName, ContestDifficulty.ContestLevel difficultyLevel, User user) {
        this.contestName = contestName;
        this.questionList = new ArrayList<>();
        this.difficultyLevel = difficultyLevel;
        this.id++;
        this.user=user;
        this.userList = new ArrayList<>();
    }

    public String getContestName() {
        return contestName;
    }

    public void setContestName(String contestName) {
        this.contestName = contestName;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Contest.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    public ContestDifficulty.ContestLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(ContestDifficulty.ContestLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

}
