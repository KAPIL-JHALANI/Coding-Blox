package Repository;

import Constant.ContestDifficulty;
import Entity.Contest;
import Entity.User;
import Service.UserService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContestRepository {

    List<Contest> contestList;
    Map<ContestDifficulty.ContestLevel, List<Contest>> contestDifficultyMap;
    Map<Integer,Contest>contestMap;
    UserRepository users = UserService.getUserRepository();

    public ContestRepository() {
        this.contestList = new ArrayList<>();
        this.contestMap = new HashMap<>();
        this.contestDifficultyMap = new HashMap<>();
        this.contestDifficultyMap.put(ContestDifficulty.ContestLevel.LOW,new ArrayList<>());
        this.contestDifficultyMap.put(ContestDifficulty.ContestLevel.MEDIUM,new ArrayList<>());
        this.contestDifficultyMap.put(ContestDifficulty.ContestLevel.HIGH,new ArrayList<>());
    }

    public void createContest(String contest_name, ContestDifficulty.ContestLevel contestLevel, String createrName){
        User user = users.map.get(createrName);
        Contest contest = new Contest(contest_name,contestLevel,user);
        user.getContestList().add(contest);
        contest.getUserList().add(user);
        contestList.add(contest);
        contestDifficultyMap.get(contestLevel).add(contest);
        contestMap.put(contest.id,contest);
    }

    public List<Contest> listContest(ContestDifficulty.ContestLevel contestLevel){
        if(contestLevel == null){
            return contestList;
        }
        return contestDifficultyMap.get(contestLevel);
    }

    public void attendContest(int contestId, String userName){
        Contest contest = contestMap.get(contestId);
        User user = users.map.get(userName);
        contest.getUserList().add(user);
    }


}
