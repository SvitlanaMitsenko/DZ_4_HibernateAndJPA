package org.example.Task7;

import org.example.Task6.Entity.Book;
import org.example.Task6.HibernateUtil;
import org.example.Task7.Entity.Animal;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class AnimalHelper {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("workflow");
    EntityManager em;

    public AnimalHelper() {

    }

    public List<Animal> getAnimalList(){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT animals FROM Animal animals");
        List<Animal> animals = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return animals;
    }

    public Animal getAnimalById(int id){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        Animal animal = (Animal)em.find(Animal.class, id);
        em.getTransaction().commit();
        em.close();
        return animal;
    }

    public void addAnimal(Animal animal){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(animal);
        em.getTransaction().commit();
        em.close();
    }

    public void removeAnimal(int id) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        Animal animal = (Animal)em.find(Animal.class, id);
        em.remove(animal);
        em.getTransaction().commit();
        em.close();
    }

}
