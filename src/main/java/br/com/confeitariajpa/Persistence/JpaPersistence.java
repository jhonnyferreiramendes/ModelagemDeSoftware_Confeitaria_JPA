package br.com.confeitariajpa.Persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Objects;

import static javax.persistence.Persistence.createEntityManagerFactory;

public class JpaPersistence {

    //Fazer a comunicação com banco de dados
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("confeitaria");

    private EntityManager em;
    public EntityManager getEm(){
        if(Objects.isNull(em)){
            em = emf.createEntityManager();
        }
        return em;
    }
}
