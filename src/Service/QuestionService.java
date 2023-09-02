package Service;

import Constant.QuestionDifficulty;
import Entity.Question;
import Repository.QuestionRepository;
import Repository.UserRepository;

import java.util.List;

public class QuestionService {

    QuestionRepository questionRepository = new QuestionRepository();

    public  void createQuestion(QuestionDifficulty.DifficultyLevel difficultyLevel, int score){
        questionRepository.createQuestion(difficultyLevel,score);
    }

    public List<Question> listQuestion(QuestionDifficulty.DifficultyLevel difficultyLevel){
        return questionRepository.listQuestion(difficultyLevel);
    }
}
