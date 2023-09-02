package Entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    int score;
    List<Contest> contestList;

    public User(String name) {
        this.name = name;
        this.score = 1500;
        this.contestList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<Contest> getContestList() {
        return contestList;
    }

    public void setContestList(List<Contest> contestList) {
        this.contestList = contestList;
    }
}
