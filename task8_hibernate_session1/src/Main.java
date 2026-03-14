import com.example.hibernateStart.entities.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

     // create seesion and session factory

        SessionFactory sessionFactory = new Configuration().configure("hibernate-config.xml")
                .addAnnotatedClass(UserEntity.class)
                .buildSessionFactory() ;


        Session session = sessionFactory.getCurrentSession();

        UserEntity user = new UserEntity("hamza","ali");
        UserEntity savedUser ;

        try {
            session.beginTransaction();

            // save user
            session.save(user);

            // get usr
            savedUser = (UserEntity)session.get(UserEntity.class,100);

            session.getTransaction().commit();
        }
        finally {
            session.close();
        }


     System.out.println(savedUser);

        Session session2 = sessionFactory.getCurrentSession();
        try {
            session2.beginTransaction();

            // delete usr
            session2.delete(savedUser);

            session2.getTransaction().commit();
        }
        finally {
            session2.close();
        }








    }
}