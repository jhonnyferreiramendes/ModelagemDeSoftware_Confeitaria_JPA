package br.com.confeitariajpa.DAO;

public interface IGenericDAO <T>{

    public void saveOrUpdate(T object);
    public T findById(long id);
    public  void remover(long id);

}
