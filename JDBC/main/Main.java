package JDBC.main;

import JDBC.bean.User;
import JDBC.dao.inter.UserDaoInter;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        // thightly coupling :
        // UserDaoInter userDaoInter = new UserDaoImpl();
        // loosely coupling :
        UserDaoInter userDaoInter = Context.instanceUserDao();

        List<User> list = userDaoInter.getAll();
        System.out.println("list = " + list);

        // --------------------------------------------

        User user = userDaoInter.getById(3);
        user.setName("yeniAd");
        userDaoInter.updateUser(user);

    }

}