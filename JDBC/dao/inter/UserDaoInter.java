package JDBC.dao.inter;

import JDBC.bean.User;

import java.util.List;

public interface UserDaoInter {

    public List<User> getAll();

    public User getById(int userId);

    public boolean updateUser(User user);

    public boolean removeUser(int id);

}
