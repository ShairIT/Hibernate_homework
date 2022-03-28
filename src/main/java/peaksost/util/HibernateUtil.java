package peaksost.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import peaksost.entity.*;

import java.util.Properties;


public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory(){
        if(sessionFactory == null){
            try{
                Configuration configuration = new Configuration();
                Properties properties =new Properties();
                properties.put(Environment.DRIVER, "org.postgresql.Driver");
                properties.put(Environment.URL, "jdbc:postgresql://localhost:5432/postgres");
                properties.put(Environment.USER, "postgres");
                properties.put(Environment.PASS, "gulu84");
                properties.put(Environment.HBM2DDL_AUTO, "update");
                properties.put(Environment.SHOW_SQL, true);
                configuration.setProperties(properties);
                configuration.addAnnotatedClass(Animal.class);
                configuration.addAnnotatedClass(Cars.class);
                configuration.addAnnotatedClass(Country.class);
                configuration.addAnnotatedClass(Person.class);
                configuration.addAnnotatedClass(Products.class);
                configuration.addAnnotatedClass(Culture.class);
                configuration.addAnnotatedClass(House.class);
                configuration.addAnnotatedClass(Fruits.class);
                configuration.addAnnotatedClass(Rivers.class);
                configuration.addAnnotatedClass(School.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();

                sessionFactory = configuration.buildSessionFactory(serviceRegistry);

            } catch (Exception e) {
                e.getMessage();
            }
        }
        return sessionFactory;
    }

}




