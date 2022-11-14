package com.pdaProjet.Repository;
import com.pdaProjet.Entitys.User;
import com.mysql.cj.Session;
import com.pdaProjet.Util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import  org.hibernate.query.Query;
public class RepoUser {

    public int login (String email , String password){
        User user = new RepoUser().findByEmail(email);
        if(user.getEmail() == null){return 0;}
        return  (user.getPassword().equals(Password)) ? 1 : 2;
    }

    public User findByEmail(String Email) {
        Session session = HibernateFactory.getInstance().getSession().openSession();
        session.beginTransaction();

        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        
        Query<User> query = entityTransaction.createQuery("from Users where email =:email",User.class);
        query.setParameter("email", Email);

        User user = query.getSingleResult();

        session.close();

        return user;
    }
}
