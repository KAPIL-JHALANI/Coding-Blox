package Service;

import Repository.UserRepository;

public class UserService {

    private static UserRepository userRepository =null;
    private UserService() {}

    public static UserRepository getUserRepository() {
        if(userRepository==null){
            userRepository=new UserRepository();
        }
        return  userRepository;
    }

    public  void createUser(String name){
        userRepository.createUser(name);
    }
}
