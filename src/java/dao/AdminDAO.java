package dao;

import model.Admin;

public interface AdminDAO {
    boolean register(Admin admin);
    boolean checkAdmin(Admin admin);
}
