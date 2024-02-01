package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {
    public static void main(String[] args) throws Exception {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        Pessoa p = new Pessoa(null, "Joaquim Silva", "joaquim@gmail.com");
        
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
       
        p = em.find(Pessoa.class, 2);
        
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
        
        System.out.println("Pronto!");
        em.close();
        emf.close();
    }
}