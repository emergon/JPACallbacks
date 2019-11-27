package com.emergon.jpacallbacks;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainClass {

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACallbacksPU");

    public static void main(String[] args) {

//        em.getTransaction().begin();
//        //persist customer
//        Customer customer = new Customer("Nick");
//        System.out.println("@@@@Before Persist Customer@@@@@");
//        em.persist(customer);
//        System.out.println("@@@@After Persist Customer@@@@@");
//        em.getTransaction().commit();
//        //refresh customer
//        System.out.println("@@@@Before refresh Customer@@@@@");
//        em.refresh(customer);
//        System.out.println("@@@@After refresh Customer@@@@@");
//        //update customer
//        em.getTransaction().begin();
//        customer.setCname("John");
//        System.out.println("@@@@Before commit update Customer@@@@@");
//        em.getTransaction().commit();
//        System.out.println("@@@@After commit update Customer@@@@@");
//        //remove customer
//        em.getTransaction().begin();
//        System.out.println("@@@@Before remove Customer@@@@@");
//        em.remove(customer);
//        System.out.println("@@@@After remove Customer@@@@@");
//        em.getTransaction().commit();
 



Customer c = save(new Customer("Jonathan"));
        update(c);

        emf.close();
    }

    private static Customer save(Customer c) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        em.close();
        return c;
    }

    private static void update(Customer c) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        c = em.merge(c);
        //c.setCname("Nick");
        em.getTransaction().commit();
        em.close();
    }
}
