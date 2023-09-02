package Repository;

import Constant.QuestionDifficulty;
import Entity.Question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionRepository {
    List<Question>questionList = new ArrayList<>();
    Map<QuestionDifficulty.DifficultyLevel,ArrayList<Question>>map1=new HashMap<>();

    public QuestionRepository() {
        map1.put(QuestionDifficulty.DifficultyLevel.LOW,new ArrayList<>());
        map1.put(QuestionDifficulty.DifficultyLevel.MEDIUM,new ArrayList<>());
        map1.put(QuestionDifficulty.DifficultyLevel.HIGH,new ArrayList<>());
    }

    public  void createQuestion(QuestionDifficulty.DifficultyLevel difficultyLevel, int score){
        Question question = new Question(difficultyLevel,score);
        questionList.add(question);
        map1.get(difficultyLevel).add(question);
    }

    public List<Question> listQuestion(QuestionDifficulty.DifficultyLevel difficultyLevel){
        if(difficultyLevel == null){
            return questionList;
        }
        return map1.get(difficultyLevel);
    }
}
