package main;

import dao.impl.UserDaoImpl;
import dao.inter.UserDaoInter;

public class Context {

    // Tutagki UserDaoImpl mysql ile ishleyir, sabah bize oracle lazim olsa her yerde deyishiyliy elemeye ehtiyac yoxdu
    // sadece yeni UserDaoImpl2 yaradib ora oracle qoyub burda return new UserDaoImpl -> new UserDaoImpl2 cevireciyiy
    public static UserDaoInter instanceUserDao() {
        return new UserDaoImpl();
    }

}
