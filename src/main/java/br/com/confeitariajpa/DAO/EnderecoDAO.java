package br.com.confeitariajpa.DAO;

import br.com.confeitariajpa.Persistence.JpaPersistence;
import br.com.confeitariajpa.domain.Endereco;

import javax.swing.*;

public class EnderecoDAO implements IGenericDAO<Endereco> {

    private JpaPersistence jpaPersistence;

    public EnderecoDAO() {
        this.jpaPersistence = new JpaPersistence();
    }

    @Override
    public void saveOrUpdate(Endereco object) {
        this.jpaPersistence.getEm().getTransaction().begin();
        this.jpaPersistence.getEm().merge(object);
        this.jpaPersistence.getEm().getTransaction().commit();

    }

    @Override
    public Endereco findById(long id) {
        return (Endereco) this.jpaPersistence.getEm().find(Endereco.class, id);
    }

    @Override
    public void remover(long id) {
        Endereco buscar = findById(id);
        if (buscar != null) {
            this.jpaPersistence.getEm().getTransaction().begin();
            this.jpaPersistence.getEm().remove(buscar);
            this.jpaPersistence.getEm().getTransaction().commit();

        } else{
            JOptionPane.showMessageDialog(null, "ID inexistente");
        }

    }

    public JpaPersistence getJpaPersistence() {
        return jpaPersistence;
    }
}
