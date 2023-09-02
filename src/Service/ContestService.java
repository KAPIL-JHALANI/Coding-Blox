package Service;

import Constant.ContestDifficulty;
import Entity.Contest;
import Repository.ContestRepository;

import java.util.List;

public class ContestService {

    ContestRepository contestRepository = new ContestRepository();
    public void createContest(String contest_name, ContestDifficulty.ContestLevel contestLevel, String createrName){
        contestRepository.createContest(contest_name, contestLevel, createrName);
    }

    public List<Contest> listContest(ContestDifficulty.ContestLevel contestLevel){
        return contestRepository.listContest(contestLevel);
    }

    public  void attendContest( int contestId, String username){
        contestRepository.attendContest(contestId,username);
    }
}
