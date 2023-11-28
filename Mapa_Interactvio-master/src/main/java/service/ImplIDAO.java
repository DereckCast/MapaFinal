package service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;


import java.util.List;

public class ImplIDAO implements IDAO{
    @Override
    public <T> List<T> getAll(String nameQuery, Class<T> clazz) {
        EntityManager em = EntityManagerAdmin.getInstance();
        try {
            TypedQuery<T> query = em.createNamedQuery(nameQuery,clazz);
            return query.getResultList();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            em.close();
        }
        return null;
    }

    @Override
    public <T> void insert(T entity) {
        EntityManager em = EntityManagerAdmin.getInstance();
        try {
            em.getTransaction().begin();
            em.persist(entity);
            em.flush();
            em.getTransaction().commit();
        }
        catch(Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        finally {
            em.close();
        }

    }

    @Override
    public <T> T update(T entity) {
        EntityManager em = EntityManagerAdmin.getInstance();
        try {
            em.getTransaction().begin();
            T ent = em.merge(entity);
            em.flush();
            em.getTransaction().commit();
            return ent;
        }
        catch(Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        finally {
           em.close();
        }
        return null;
    }


    @Override
    public <T> List<T> get(String namedQuery, Class<T> clazz, Object... param) {
        EntityManager em = EntityManagerAdmin.getInstance();
        try {
            TypedQuery<T> query = em.createNamedQuery(namedQuery, clazz);
            int position = 1;
            for (Object obj : param) {
                query.setParameter(position++,obj);
            }
            return query.getResultList();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
        finally {
            em.close();
        }
    }
    @Override
    public <T> void remove(T entity) {
        EntityManager em = EntityManagerAdmin.getInstance();
        try {
            em.getTransaction().begin();
            em.remove(em.merge(entity));
            em.flush();
            em.getTransaction().commit();
        }
        catch(Exception e){
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        finally {
            em.close();
        }
    }

}
