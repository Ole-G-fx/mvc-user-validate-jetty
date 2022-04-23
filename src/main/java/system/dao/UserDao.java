package system.dao;

import org.springframework.stereotype.Repository;
import system.model.User;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserDao {

    private List<User> users = Arrays.asList(new User("admin", "admin"),
                                            new User("user1","user1"));

    public List<User> getAllUsers(){
        return  users;
    }

    public User getByName(String name) {
        for (User el: users) {
            if (el.getName().equals(name))
                return el;
        }
        return null;
    }
}
