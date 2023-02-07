package dao.inter;

import bean.User;

import java.util.List;

public interface UserDaoInter {

    public List<User> getAll();

    public User getById(int userId);

    public boolean insertUser(User user);

    public boolean updateUser(User user);

    public boolean deleteUser(int id);

}
