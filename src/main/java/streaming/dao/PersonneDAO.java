/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import streaming.entity.Personne;

/**
 *
 * @author admin
 */
@Repository
public class PersonneDAO {

    @PersistenceContext
    private EntityManager em; 

    public List<Personne> listepersonne() {
        return em.createQuery("SELECT p FROM Personne p ORDER BY p.nom,p.prenom DESC").getResultList();
    }

    @Transactional //remplace em.getTransaction().begin(); avec em.getTransaction().commit();
    public void ajouter(Personne p) {
        em.persist(p);

    }

}
