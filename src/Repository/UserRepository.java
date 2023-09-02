package Repository;

import Entity.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {

    List<User> userList=new ArrayList<>();
    Map<String,User> map=new HashMap<>();
    public void  createUser(String name){
        User user = new User(name);
        userList.add(user);
        map.put(name,user);
    }
}
