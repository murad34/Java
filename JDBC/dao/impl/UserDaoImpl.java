package JDBC.dao.impl;

import JDBC.bean.User;
import JDBC.dao.inter.AbstractDAO;
import JDBC.dao.inter.UserDaoInter;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl extends AbstractDAO implements UserDaoInter {

    @Override
    public List<User> getAll() {

        List<User> resultList = new ArrayList<>();

        try (Connection connection = connect()) {

            Statement statement = connection.createStatement();
            statement.execute("select * from user");
            ResultSet resultSet = statement.getResultSet();

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String phone = resultSet.getString("phone");
                String email = resultSet.getString("email");

                resultList.add(new User(id, name, surname, phone, email));
            }

            // try-with-resources istidafe etdiyimize gore buna ehtiyac qalmmir
            // ve zaten connection close eliyende avtomatik resultSet ve statement close olur
//            resultSet.close();
//            statement.close();
//            connection.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return resultList;
    }

    @Override
    public User getById(int userId) {

        User result = null;

        try (Connection connection = connect()) {

            Statement statement = connection.createStatement();
            statement.execute("select * from user where id = " + userId);
            ResultSet resultSet = statement.getResultSet();

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String phone = resultSet.getString("phone");
                String email = resultSet.getString("email");

                result = new User(id, name, surname, phone, email);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return result;
    }

    @Override
    public boolean updateUser(User user) {

        try (Connection connection = connect()) {

//            Statement statement = connection.createStatement();
//            return statement.execute("update user set name = 'MURAD' where id = 1");

            // sql injection qabagin almag ucun :
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "update user set name = ?, surname = ?, phone = ?, email = ? where id = ?");

            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getSurname());
            preparedStatement.setString(3, user.getPhone());
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setInt(5, user.getId());

            return preparedStatement.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean removeUser(int id) {

        try (Connection connection = connect()) {

            Statement statement = connection.createStatement();
            return statement.execute("delete from user where id = " + id);

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }

}
