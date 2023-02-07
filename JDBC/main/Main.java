package main;

import bean.User;
import dao.inter.UserDaoInter;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        // thightly coupling :
        // UserDaoInter userDaoInter = new UserDaoImpl();

        // loosely coupling :
        UserDaoInter userDaoInter = Context.instanceUserDao();

        // get all users
        List<User> list = userDaoInter.getAll();
        System.out.print(list);

        // --------------------------------------------

        // get user by id
//        User user = userDaoInter.getById(3);
//        System.out.println(user);

        // update user
//        user.setName("yeniAd");
//        userDaoInter.updateUser(user);
//        System.out.println(user);

        // delete user
//        userDaoInter.deleteUser(6);

        // insert user
//        User newUser = new User("Sabina","Ramazanova","0993337766","unknown@mail.ru");
//        userDaoInter.insertUser(newUser);



    }

}