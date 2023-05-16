package org.example.Task6;

import org.example.Task6.Entity.Book;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class BookHelper {
    private SessionFactory sessionFactory;

    public BookHelper() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public List<Book> getBookList(){
        // открыть сессию - для манипуляции с персист. объектами
        Session session = sessionFactory.openSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(Book.class);
        Root<Book> root = cq.from(Book.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        List<Book> bookList = query.getResultList();
        session.close();
        return bookList;
    }

    public Book getBookById(long id){
        Session session = sessionFactory.openSession();
        Book book = session.get(Book.class, id);
        session.close();
        return book;
    }

    public void addBook(Book book){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();
        session.close();
    }

    public void removeBook(long id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Object persistentInstance = session.load(Book.class, id);
        if (persistentInstance != null)
        {
            session.remove(persistentInstance);
        }
        //session.remove(Book.class, id);
        session.getTransaction().commit();
        session.close();
    }
}
