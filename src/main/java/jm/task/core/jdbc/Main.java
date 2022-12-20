package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.Person;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        User user1 = new User("bob", "Fedotkin", (byte) 18);
//        User user2 = new User("bob2", "Fedotkin2", (byte) 28);
//        User user3 = new User("bob3", "Fedotkin3", (byte) 38);
//        User user4 = new User("bob4", "Fedotkin4", (byte) 48);
//
//        List<User> users = new ArrayList<>();
//        users.add(user1);
//        users.add(user2);
//        users.add(user3);
//        users.add(user4);
//
//        UserServiceImpl userService = new UserServiceImpl();
//        userService.createUsersTable();
//        users.stream().forEach(x -> {
//                    userService.saveUser(x.getName(), x.getLastName(), x.getAge());
//                    System.out.println(x.getName() + " добавлен в базу данных.");
//                }
//        );
//        userService.getAllUsers().stream().forEach(x -> {
//            System.out.println(x.toString());
//        });
//
//        userService.cleanUsersTable();
//        userService.dropUsersTable();
//        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);
//
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.getCurrentSession();
//        try {
//            session.beginTransaction();
//
//            Person person1 = new Person("test1", 20);
//            Person person2 = new Person("test2", 30);
//            Person person3= new Person("test3", 40);
//
//            session.save(person1);
//            session.save(person2);
//            session.save(person3);
//
//            session.getTransaction().commit();
//        } finally {
//            sessionFactory.close();
//        }
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("pop", "pep", (byte) 10);
        userService.saveUser("pop2", "pep2", (byte) 20);
        userService.saveUser("pop3", "pep3", (byte) 30);
        userService.saveUser("pop4", "pep4", (byte) 40);

        System.out.println(userService.getAllUsers());

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
