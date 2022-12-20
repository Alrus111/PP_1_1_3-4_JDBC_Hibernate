package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.Person;
import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private  static final  String URL = "jdbc:mysql://localhost:3306/hibenate_learn";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "kotopec(#)%2";

    private static Connection connection;
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (
                SQLException throwable) {
            throwable.printStackTrace();
        }
        return connection;
    }
    public static SessionFactory getSessionFactory() {

        Configuration configuration = new Configuration().addAnnotatedClass(User.class);

        return configuration.buildSessionFactory();
    }
}