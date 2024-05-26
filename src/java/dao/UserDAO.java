package dao;

import model.User;

public interface UserDAO {
    boolean register(User user);
    boolean checkUser(User user);
}
