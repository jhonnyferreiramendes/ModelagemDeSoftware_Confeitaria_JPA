package br.com.confeitariajpa.DAO;

import br.com.confeitariajpa.Persistence.JpaPersistence;
import br.com.confeitariajpa.domain.Cliente;

import javax.swing.*;

public class ClienteDAO implements IGenericDAO<Cliente> {

    private JpaPersistence jpaPersistence;

    public ClienteDAO() {
        this.jpaPersistence = new JpaPersistence();
    }

    @Override
    public void saveOrUpdate(Cliente cliente) {
        this.jpaPersistence.getEm().getTransaction().begin();
        this.jpaPersistence.getEm().merge(cliente);
        this.jpaPersistence.getEm().getTransaction().commit();

    }

    @Override
    public Cliente findById(long id) {
        return (Cliente) this.jpaPersistence.getEm().find(Cliente.class, id);
    }

    @Override
    public void remover(long id) {
        Cliente buscar = findById(id);
        if (buscar != null) {
            this.jpaPersistence.getEm().getTransaction().begin();
            this.jpaPersistence.getEm().remove(buscar);
            this.jpaPersistence.getEm().getTransaction().commit();

        } else{
            JOptionPane.showMessageDialog(null, "ID inexistente");
        }
    }

}
