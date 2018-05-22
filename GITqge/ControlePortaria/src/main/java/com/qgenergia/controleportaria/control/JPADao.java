
package com.qgenergia.controleportaria.control;

import com.qgenergia.controleportaria.model.Portaria;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class JPADao implements JPAutil {

    private final EntityManagerFactory factory = Persistence.createEntityManagerFactory("Portaria_PU");

    private final EntityManager entityManager = factory.createEntityManager();

    @Override
    public void salvar(Portaria p) {
        entityManager.getTransaction().begin();
        try {
            entityManager.persist(p);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
            factory.close();
        }

    }

    @Override
    public List<Portaria> getAll() {

        entityManager.getTransaction().begin();
        TypedQuery<Portaria> lista = entityManager.createNamedQuery(Portaria.TODOS, Portaria.class);

        List<Portaria> resultList = lista.getResultList();
        entityManager.close();
        factory.close();
        return resultList;
    }

}
