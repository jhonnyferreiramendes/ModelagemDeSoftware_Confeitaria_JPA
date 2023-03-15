package br.com.confeitariajpa.DAO;

import br.com.confeitariajpa.domain.Bolo;
import br.com.confeitariajpa.Persistence.JpaPersistence;

import javax.swing.*;


public class BoloDAO implements IGenericDAO<Bolo> {

    private JpaPersistence jpaPersistence;

    public BoloDAO() {
        this.jpaPersistence = new JpaPersistence();
    }




    @Override
    public void saveOrUpdate (Bolo bolo){
        this.jpaPersistence.getEm().getTransaction().begin();
        this.jpaPersistence.getEm().merge(bolo);
        this.jpaPersistence.getEm().getTransaction().commit();
    }


    @Override
    public Bolo findById(long id) {
        return (Bolo) this.jpaPersistence.getEm().find(Bolo.class, id);

    }


    public void remover(long id){
        Bolo buscar = findById(id);
        if(buscar != null){
            this.jpaPersistence.getEm().getTransaction().begin();
            this.jpaPersistence.getEm().remove(buscar);
            this.jpaPersistence.getEm().getTransaction().commit();
        } else{
            JOptionPane.showMessageDialog(null, "ID inexistente");
        }
    }



    /*@Override
    public void remover(Bolo bolo) {
        this.jpaPersistence.getEm().getTransaction().begin();
        this.jpaPersistence.getEm().remove(bolo);
        this.jpaPersistence.getEm().getTransaction().commit();
        }*/

}
