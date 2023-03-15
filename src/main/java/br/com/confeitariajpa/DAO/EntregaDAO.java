package br.com.confeitariajpa.DAO;

import br.com.confeitariajpa.domain.Endereco;
import br.com.confeitariajpa.domain.Entrega;


public class EntregaDAO extends EnderecoDAO {

    public void saveOrUpdate(Entrega entrega) {
        super.saveOrUpdate(entrega);
    }

    public Entrega findById(Class c, Long id) {
        return (Entrega) super.findById(id);
    }

    public void remover(Long id) {
        super.remover(id);
    }


}
